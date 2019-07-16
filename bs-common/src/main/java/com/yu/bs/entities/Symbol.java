package com.yu.bs.entities;

import java.io.Serializable;

/**
 * @author HuangYu
 * @create 2019/7/12
 * @since 1.0.0
 */

public class Symbol implements Serializable {

    /**
     * quote : 代币名称
     * symbol : 交易对
     */

    private String quote;
    private String symbol;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}