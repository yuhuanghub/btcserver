from btcquant import EXCHANGES
import numpy as np
import time


class Service(object):

    def __init__(self, exchanegs = 'zb'):
        self.exchangs = exchanegs
        self.client = EXCHANGES(self.exchangs)

    def get_all_symbol(self):
        return self.client.markets()

    # 获取当前币对的最新成交价
    def get_ticker(self, symbol):
        return self.client.ticker(symbol)

    # 获取K线
    def get_kline(self, symbol, t):
        result = self.client.kline(symbol, interval=t, limit=20)
        l = np.array(result)
        data = []
        data_detail = {}
        for x in np.nditer(l, flags=['external_loop'], order='F'):
            time_local = time.localtime(x[0])
            data_detail['time'] = time.strftime("%Y-%m-%d %H:%M:%S", time_local)
            data_detail['open'] = x[1]
            data_detail['high'] = x[2]
            data_detail['low'] = x[3]
            data_detail['close'] = x[4]
            data_detail['volume'] = x[5]
            data.append(data_detail)
        return data


service = Service()