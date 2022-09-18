package com.ll.exam.dockerexam.article.Repository;

import com.ll.exam.dockerexam.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
