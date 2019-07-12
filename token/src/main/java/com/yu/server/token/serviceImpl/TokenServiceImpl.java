package com.yu.server.token.serviceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yu.server.token.pojo.Symbol;
import com.yu.server.token.pojo.Kline;
import com.yu.server.token.service.TokenService;
import com.yu.server.token.utils.OKHttpUtil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HuangYu
 * @create 2019/7/12
 * @since 1.0.0
 */
@Service
public class TokenServiceImpl implements TokenService {

    @Value("${url}")
    String baseUrl;

    @Override
    public List<Symbol> findAllSymbol() {
        String symbols = OKHttpUtil.httpGet(baseUrl + "getAllSymbol");
        return JSON.parseArray(symbols, Symbol.class);
    }

    @Override
    public Symbol findSymbols(String quote) {
        return null;
    }

    @Override
    public JSONObject getTicker(String symbol) {
        String ticker = OKHttpUtil.httpGet(baseUrl + "getTicker?symbol=" + symbol);
        return JSON.parseObject(ticker);
    }

    @Override
    public List<Kline> getKline(String symbol, String time) {
        String kline = OKHttpUtil.httpGet(baseUrl + "getKline?symbol=" + symbol + "&time=" + time);
        return JSON.parseArray(kline, Kline.class);
    }
}