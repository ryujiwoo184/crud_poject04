package com.sparta.crud_prac04.controller;

import com.sparta.crud_prac04.dto.PostRequestDto;
import com.sparta.crud_prac04.model.Post;
import com.sparta.crud_prac04.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostController {


    private final PostService postService;

    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestDto postRequestDto){
       return postService.createPost(postRequestDto);
    }
}
