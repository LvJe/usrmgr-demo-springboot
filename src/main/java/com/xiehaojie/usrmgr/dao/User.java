package com.xiehaojie.usrmgr.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private Integer age;
    private Integer gender;
    private String phoneNo;
    private String address;
    private String isDeleted;
    private String createdAt;
    private String updatedAt;


    public enum GenderEnum {
        // 默认
        GENDER_DEFAULT,
        // 男性
        GENDER_MALE,
        // 女性
        GENDER_FEMALE,
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}