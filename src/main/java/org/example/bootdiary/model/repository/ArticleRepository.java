package org.example.bootdiary.model.repository;

import org.example.bootdiary.model.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
