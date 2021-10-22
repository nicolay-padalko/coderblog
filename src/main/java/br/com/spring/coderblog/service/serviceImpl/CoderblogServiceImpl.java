package br.com.spring.coderblog.service.serviceImpl;

import br.com.spring.coderblog.model.Post;
import br.com.spring.coderblog.repository.CoderblogRepository;
import br.com.spring.coderblog.service.CoderblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoderblogServiceImpl implements CoderblogService {

    @Autowired
    CoderblogRepository coderblogRepository;

    @Override
    public List<Post> findAll() {
        return coderblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return coderblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return coderblogRepository.save(post);
    }
}
