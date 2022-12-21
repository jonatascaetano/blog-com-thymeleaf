package com.jonatas.blog.service.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonatas.blog.model.PostModel;
import com.jonatas.blog.repository.PostRepository;
import com.jonatas.blog.service.PostService;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<PostModel> findAll() {
        return postRepository.findAll();
    }

    @Override
    public PostModel findById(UUID id) {
        return postRepository.findById(id).get();
    }

    @Override
    public PostModel save(PostModel post) {
        return postRepository.save(post);
    }
    
}
