package com.yu.bs.service;

import com.alibaba.fastjson.JSONObject;
import com.yu.bs.pojo.Kline;
import com.yu.bs.pojo.Symbol;

import java.util.List;

/**
 * @author HuangYu
 * @create 2019/7/12
 * @since 1.0.0
 */
public interface TokenService {

    /**
     * 查询所有支持的交易对
     * @return
     */
    List<Symbol> findAllSymbol();

    /**
     * 查询支持的交易对
     * @param quote 代币
     * @return
     */
    Symbol findSymbols(String quote);

    /**
     * 得到最近的交易信息
     * @param symbol 交易对
     * @return
     */
    JSONObject getTicker(String symbol);

    /**
     * 获取k线
     * @param symbol 交易对
     * @param time 时间
     * @return
     */
    List<Kline> getKline(String symbol, String time);
}