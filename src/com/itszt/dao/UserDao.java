package com.itszt.dao;

import com.itszt.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao {

    List<User> selectAll();

    @Insert("insert user(name,age) values(#{name},#{age})")
    void insertUser(@Param("name") String name, @Param("age") int age);
}
