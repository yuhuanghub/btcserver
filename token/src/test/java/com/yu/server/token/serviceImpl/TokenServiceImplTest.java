package com.yu.server.token.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.yu.server.token.pojo.Symbol;
import com.yu.server.token.service.TokenService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Admin
 * @version $
 * @des
 * @updateAuthor $
 * @updateDes
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TokenServiceImplTest {

    @Autowired
    TokenService mTokenService;

    @Test
    public void findAllSymbol() {
        List<Symbol> allSymbol = mTokenService.findAllSymbol();
    }

    @Test
    public void findSymbols() {
    }

    @Test
    public void getTicker() {
        JSONObject btc_usdt = mTokenService.getTicker("btc_usdt");
        System.out.println(btc_usdt);
    }

    @Test
    public void getKline() {
    }
}