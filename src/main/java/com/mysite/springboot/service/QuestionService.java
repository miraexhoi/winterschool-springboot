package com.mysite.springboot.service;

import com.mysite.springboot.exception.DataNotFoundException;
import com.mysite.springboot.entity.QuestionEntity;
import com.mysite.springboot.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    public List<QuestionEntity> getList() {
        return this.questionRepository.findAll();
    }

    public QuestionEntity getQuestion(Integer id) {
        Optional<QuestionEntity> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        }
        else throw new DataNotFoundException("question not found");
    }
}
