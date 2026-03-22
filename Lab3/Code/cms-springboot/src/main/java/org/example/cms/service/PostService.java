package org.example.cms.service;

import org.example.cms.entity.Post;
import org.example.cms.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public List<Post> getAll() {
        return repo.findAll();
    }

    public Post create(Post post) {
        return repo.save(post);
    }
}