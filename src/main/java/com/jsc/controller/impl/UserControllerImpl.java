package com.jsc.controller.impl;

import com.jsc.controller.UserController;
import com.jsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping("/mainPage")
    public String mainPage() {
        return "hello world";
    }
}
