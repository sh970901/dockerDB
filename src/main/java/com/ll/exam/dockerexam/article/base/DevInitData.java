package com.ll.exam.dockerexam.article.base;

import com.ll.exam.dockerexam.article.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData {
    @Bean
    CommandLineRunner initDevData(ArticleService articleService){
        return args -> {
            articleService.write("제목111");
            articleService.write("제목2");
        };
    }
}
