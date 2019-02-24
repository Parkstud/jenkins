package com.example.springboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "hello,this is a springboot demo";
    }
}
