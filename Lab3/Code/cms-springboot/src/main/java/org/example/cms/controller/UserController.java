package org.example.cms.controller;

import org.example.cms.entity.User;
import org.example.cms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/create")
    public String form(User user) {
        return "users/create";
    }

    @PostMapping("/create")
    public String create(User user) {
        service.create(user);
        return "redirect:/posts";
    }
}
