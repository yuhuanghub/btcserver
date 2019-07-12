package com.yu.server.token.controller;

import com.alibaba.fastjson.JSONObject;
import com.yu.server.token.pojo.Kline;
import com.yu.server.token.pojo.Symbol;
import com.yu.server.token.service.TokenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author HuangYu
 * @create 2019/7/12
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api")
public class TokenController {

    @Autowired
    TokenService mTokenService;

    @RequestMapping(value = "/findAllSymbol", method = RequestMethod.GET)
    public List<Symbol> findAllSymbol(){
        return mTokenService.findAllSymbol();
    }

    @RequestMapping(value = "/getTicker", method = RequestMethod.GET)
    public JSONObject getTicker(@RequestParam("symbol") String symbol){
        return mTokenService.getTicker(symbol);
    }


    @RequestMapping(value = "/getKline", method = RequestMethod.GET)
    public List<Kline> getKline(@RequestParam("symbol") String symbol, @RequestParam("time") String time){
        return mTokenService.getKline(symbol, time);
    }
}