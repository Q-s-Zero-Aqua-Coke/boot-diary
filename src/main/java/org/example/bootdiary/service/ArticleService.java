package org.example.bootdiary.service;

import org.example.bootdiary.model.entity.Article;
import org.example.bootdiary.model.form.ArticleForm;

import java.util.List;

public interface ArticleService {
    List<Article> findAll();

    void save(ArticleForm form, String filename) throws Exception;
}
