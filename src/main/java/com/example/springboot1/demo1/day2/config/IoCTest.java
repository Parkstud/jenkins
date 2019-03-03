package com.example.springboot1.demo1.day2.config;


import com.example.springboot1.demo1.day2.pojo.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author chenmiao
 * @version 1.0
 * @des ${
 *  测试IOC
 *  }
 * @Date 2019/3/3 9:16
 * @updateAuthor $陈苗$
 * @updateDes ${TODO}
 */
public class IoCTest {
    private static final Logger logger = LoggerFactory.getLogger(IoCTest.class);

    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User bean = ctx.getBean(User.class);
        DataSource dataSource = ctx.getBean(DataSource.class);
        logger.info(dataSource.getConnection().toString());
    }
}
