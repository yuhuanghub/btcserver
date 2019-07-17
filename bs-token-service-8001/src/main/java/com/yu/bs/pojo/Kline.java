package com.yu.bs.pojo;

/**
 * @author HuangYu
 * @create 2019/7/12
 * @since 1.0.0
 */
public class Kline {

    /**
     * close : 11528.09
     * high : 11528.17
     * low : 11524.95
     * open : 11525.96
     * time : 2019-07-12 23:09:00
     * volume : 4.9426
     */

    private double close;
    private double high;
    private double low;
    private double open;
    private String time;
    private double volume;

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}