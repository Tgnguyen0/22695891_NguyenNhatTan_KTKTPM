package org.example.cms.controller;

import org.example.cms.entity.Post;
import org.example.cms.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    // Hiển thị danh sách bài viết
    @GetMapping
    public String index(Model model) {
        model.addAttribute("posts", service.getAll());
        System.out.println(service.getAll());
        return "posts/index";
    }

    // Form tạo
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    // Xử lý tạo
    @PostMapping("/create")
    public String create(@ModelAttribute Post post) {
        service.create(post);
        return "redirect:/posts";
    }
}
