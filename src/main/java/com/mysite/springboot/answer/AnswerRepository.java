package com.mysite.springboot.answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer> {
    // JpaRepository는 CRUD 작업을 처리하는 메서드들을 내장
    // JpaRepository<Question, Integer>는 Question 엔티티로 리포지터리를 생성한다는 의미
}

