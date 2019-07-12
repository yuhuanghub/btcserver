package com.yu.server.token.pojo;

/**
 * @author HuangYu
 * @create 2019/7/12
 * @since 1.0.0
 */
public class Ticker {

    /**
     * ask : 11525.93
     * bid : 11525.82
     * last : 11536.47
     */

    private double ask;
    private double bid;
    private double last;

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }
}