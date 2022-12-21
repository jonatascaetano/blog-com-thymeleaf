package com.jonatas.blog.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jonatas.blog.model.PostModel;
import com.jonatas.blog.service.PostService;

import jakarta.validation.Valid;

@Controller
public class PostController {
    
    @Autowired
    private PostService postService;

    @GetMapping(value = "/posts")
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<PostModel> posts = postService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @GetMapping(value = "/posts/{id}")
    public ModelAndView getPost(@PathVariable UUID id){
        ModelAndView mv = new ModelAndView("postDetails");
        PostModel post = postService.findById(id);
        mv.addObject("post", post);
        return mv;
    }

    @GetMapping(value = "/newpost")
    public String getPostForm(){
        return "postForm";
    }

    @PostMapping(value = "/newpost")
    public String savePost(@Valid PostModel post, BindingResult bResult, RedirectAttributes attributes){
        if(bResult.hasErrors()){
            return "redirect:/newpost";
        }else{
            post.setDate(LocalDateTime.now());
            postService.save(post);
            return "redirect:/posts";
        }
    }
}
