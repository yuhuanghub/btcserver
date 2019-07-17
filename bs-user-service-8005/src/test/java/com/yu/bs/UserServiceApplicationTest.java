package com.yu.bs;

import com.yu.bs.dao.TokenUserMapper;
import com.yu.bs.pojo.TokenUser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Admin
 * @version $
 * @des
 * @updateAuthor $
 * @updateDes
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class)
@Transactional
@Rollback
public class UserServiceApplicationTest {

    @Autowired
    TokenUserMapper mTokenUser;

    @Test
    public void addUser(){
        TokenUser user = new TokenUser();
        user.setName("test");
        user.setPassword("123");
        user.setPhone("12345678911");
        user.setRole("USER");
        mTokenUser.insert(user);
    }
}