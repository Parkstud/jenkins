package com.example.springboot1.demo1.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenmiao
 * @version 1.0
 * @des ${
 *     hello wold
 * }
 * @Date 2019/2/24 20:17
 * @updateAuthor $陈苗$
 * @updateDes ${TODO}
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "测试A Jenkins自动构建3"+new Date();
    }
    @GetMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value1");
        return map;
    }

}
