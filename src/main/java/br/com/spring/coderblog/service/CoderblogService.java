package br.com.spring.coderblog.service;

import br.com.spring.coderblog.model.Post;

import java.util.List;

public interface CoderblogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
