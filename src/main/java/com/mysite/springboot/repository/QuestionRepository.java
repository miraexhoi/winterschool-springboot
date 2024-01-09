package com.mysite.springboot.repository;

import com.mysite.springboot.domain.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {

}

