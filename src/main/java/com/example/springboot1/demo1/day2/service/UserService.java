package com.example.springboot1.demo1.day2.service;

import com.example.springboot1.demo1.day2.pojo.User;

import org.springframework.stereotype.Service;

/**
 * @author chenmiao
 * @version 1.0
 * @des ${
 *     用户service类
 * }
 * @Date 2019/3/3 9:48
 * @updateAuthor $陈苗$
 * @updateDes ${TODO}
 */
@Service
public class UserService {
    public void printUser(User user){
        System.out.println("编号:"+user.getId());
        System.out.println("用户名:"+user.getUserName());
        System.out.println("备注:"+user.getNote());
    }
}
