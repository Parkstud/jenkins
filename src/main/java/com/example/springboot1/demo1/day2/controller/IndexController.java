package com.example.springboot1.demo1.day2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenmiao
 * @version 1.0
 * @des ${
 *     验证jsp 视图解析器
 * }
 * @Date 2019/3/3 8:50
 * @updateAuthor $陈苗$
 * @updateDes ${TODO}
 */
@Controller
@RequestMapping("/day2")
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
