package com.example.springboot1.demo1.day2.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenmiao
 * @version 1.0
 * @des ${TODO}
 * @Date 2019/3/3 9:09
 * @updateAuthor $陈苗$
 * @updateDes ${TODO}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component("user")
public class User {
    /**
     * 编号
     */
    @Value("1")
    private Long id;
    /**
     * 用户名
     */
    @Value("user_name_1")
    private String userName;
    /**
     * 便签
     */
    @Value("note_1")
    private String note;
}
