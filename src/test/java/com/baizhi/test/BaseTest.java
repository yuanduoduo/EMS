package com.baizhi.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class) //用来加载spring工厂环境
@SpringBootTest(value = "App.class")            //整个springboot 测试入口
public class BaseTest {
}
