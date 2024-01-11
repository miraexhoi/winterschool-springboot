package com.mysite.springboot.service;

import com.mysite.springboot.entity.AnswerEntity;
import com.mysite.springboot.entity.QuestionEntity;
import com.mysite.springboot.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void create(QuestionEntity questionEntity, String content) {
        AnswerEntity answerEntity = new AnswerEntity();
        answerEntity.setContent(content);
        answerEntity.setCreateDate(LocalDateTime.now());
        answerEntity.setQuestion(questionEntity);
        this.answerRepository.save(answerEntity);
    }
}
