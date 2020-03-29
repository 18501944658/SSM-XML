package com.itszt.controller;

import com.itszt.dao.UserDao;
import com.itszt.domain.User;
import com.itszt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> selectAll() {

        List<User> users = userService.selectAll();

        System.out.println("users = " + users);
        return users;
    }

    @PostMapping("/save")
    @ResponseBody
    public void saveOne(@RequestBody User user) {
        System.out.println("user = " + user);
        userService.insertUser(user.getName(), user.getAge());
    }
}
