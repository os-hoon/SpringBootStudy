package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
//자동 임포트
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();
}
