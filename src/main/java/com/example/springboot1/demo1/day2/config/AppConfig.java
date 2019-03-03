package com.example.springboot1.demo1.day2.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

/**
 * @author chenmiao
 * @version 1.0
 * @des ${
 *     定义java的配置文件
 *    @ComponentScan(value = "com.example.springboot1.demo1.day2.*"
 *        ,excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
 * }
 * @Date 2019/3/3 9:13
 * @updateAuthor $陈苗$
 * @updateDes ${TODO}
 */
@Configuration

@ComponentScan(value = "com.example.springboot1.demo1.day2.*")
public class AppConfig {
    @Bean(name = "dataSource")
    public DataSource getDataSource(){
        Properties props = new Properties();
        props.setProperty("driver","com.mysql.jdbc.Driver");
        props.setProperty("url","jdbc:mysql://localhost:3306/springboot?serverTimezone=UTC");
        props.setProperty("username","root");
        props.setProperty("password","1115");
        DataSource dataSource=null;
        try {
            dataSource = DruidDataSourceFactory.createDataSource(props);
        }catch (Exception e){
            System.out.println(e);
        }
        return dataSource;
    }
}
