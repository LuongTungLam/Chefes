package com.chefes.page.controller;

import com.chefes.page.entity.User;
import com.chefes.page.reponsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserRepository userService;

    public UserController(UserRepository userService) {
        this.userService = userService;
    }

//    @GetMapping("/home")
//    public List<User> home(){
//        return userService.findAll();
//    }

    @GetMapping("/")
    public String homepage(Model model){
        List<User> listUsers = userService.findAll();
        model.addAttribute("users",listUsers);
        return "view/home";
    }

}
