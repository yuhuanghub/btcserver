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
        data_detil = {}
        for x in np.nditer(l, flags=['external_loop'], order='F'):
            time_local = time.localtime(x[0])
            data_detil['time'] = time.strftime("%Y-%m-%d %H:%M:%S", time_local)
            data_detil['open'] = x[1]
            data_detil['high'] = x[2]
            data_detil['low'] = x[3]
            data_detil['close'] = x[4]
            data_detil['volume'] = x[5]
            data.append(data_detil)
        return data

service = Service()
# result = service.get_kline('btc_usdt', '1min')