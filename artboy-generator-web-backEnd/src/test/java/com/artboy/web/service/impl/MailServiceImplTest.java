package com.artboy.web.service.impl;


import com.artboy.web.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MailServiceImplTest {


    @Resource
    private MailService mailServiceImpl;

    @Test
    public void sendMail() {
        System.out.println(mailServiceImpl.sendMail("1531137510@qq.com", "测试", "测试"));

    }
}
