package com.xiehaojie.usrmgr.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT id,name,age,gender,address,phone_no,created_at,updated_at,is_deleted FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    @Select("SELECT id,name,age,gender,address,phone_no,created_at,updated_at,is_deleted FROM user WHERE id = #{id}")
    User findById(@Param("id") int id);

    @Select("SELECT id,name,age,gender,address,phone_no,created_at,updated_at,is_deleted FROM user WHERE age between #{start_age} and #{end_age}")
    List<User> findByAgeGap(@Param("start_age") int startAge, @Param("end_age") int endAge);

    @Insert("INSERT INTO USER(NAME, AGE, gender, phone_no, address) VALUES(#{name}, #{age}, #{gender}, #{phone_no}, #{address})")
    int insert(@Param("name") String name, @Param("age") Integer age, @Param("gender") Integer gender, @Param("phone_no") String phone_no, @Param("address") String address);


}