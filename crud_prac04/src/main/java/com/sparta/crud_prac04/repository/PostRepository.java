package com.sparta.crud_prac04.repository;

import com.sparta.crud_prac04.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
