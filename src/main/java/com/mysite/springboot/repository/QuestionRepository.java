package com.mysite.springboot.repository;

import com.mysite.springboot.domain.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
    QuestionEntity findBySubject(String subject);
    QuestionEntity findBySubjectAndContent(String subject, String content);
    List<QuestionEntity> findBySubjectLike(String subject);
}

