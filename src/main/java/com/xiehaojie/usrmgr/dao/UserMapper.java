package com.xiehaojie.usrmgr.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT id,name,age,gender,address,phone_no,created_at,updated_at,is_deleted FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    @Select("SELECT id,name,age,gender,address,phone_no,created_at,updated_at,is_deleted FROM user WHERE id = #{id}")
    User findById(@Param("id") Long id);

    @Select("SELECT id,name,age,gender,address,phone_no,created_at,updated_at,is_deleted FROM user WHERE age between #{start_age} and #{end_age}")
    List<User> findByAgeGap(@Param("start_age") int startAge, @Param("end_age") int endAge);

    @Insert("INSERT INTO USER(NAME, AGE, gender, phone_no, address) VALUES(#{name}, #{age}, #{gender}, #{phone_no}, #{address})")
    Long insert(@Param("name") String name, @Param("age") Integer age, @Param("gender") Integer gender, @Param("phone_no") String phone_no, @Param("address") String address);

    @Insert("INSERT INTO USER(NAME, AGE, gender, phone_no, address) VALUES(#{name}, #{age}, #{gender}, #{phoneNo}, #{address})")
    Long insertByUser(User user);

    @Select("SELECT id,name,age,gender,address,phone_no,created_at,updated_at,is_deleted FROM user WHERE is_deleted = 0")
    List<User> findAll();

    @Update("UPDATE user SET age=#{age},name=#{name},gender=#{gender},address=#{address},phone_no=#{phone_no} WHERE id=#{id}")
    void update(User user);

}