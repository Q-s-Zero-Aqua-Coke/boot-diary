package org.example.bootdiary.service;

import org.example.bootdiary.model.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();

    void save(Article article);
}
