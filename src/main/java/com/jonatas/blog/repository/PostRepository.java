package com.jonatas.blog.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatas.blog.model.PostModel;

public interface PostRepository extends JpaRepository<PostModel, UUID> {
    
}
