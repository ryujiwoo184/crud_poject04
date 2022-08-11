package com.sparta.crud_prac04.service;

import com.sparta.crud_prac04.dto.PostRequestDto;
import com.sparta.crud_prac04.model.Post;
import com.sparta.crud_prac04.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;
    public Post createPost(PostRequestDto requestDto){
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }
}
