package br.com.spring.coderblog.repository;

import br.com.spring.coderblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoderblogRepository extends JpaRepository<Post, Long>{
}
