package com.jonatas.blog.service;

import java.util.List;
import java.util.UUID;

import com.jonatas.blog.model.PostModel;

public interface PostService {
    
    List<PostModel> findAll();
    PostModel findById(UUID id);
    PostModel save(PostModel post);
}
