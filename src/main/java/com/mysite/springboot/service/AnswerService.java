package com.mysite.springboot.service;

import com.mysite.springboot.entity.AnswerEntity;
import com.mysite.springboot.entity.QuestionEntity;
import com.mysite.springboot.entity.SiteUser;
import com.mysite.springboot.exception.DataNotFoundException;
import com.mysite.springboot.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerEntity create(QuestionEntity question, String content, SiteUser author) {
        AnswerEntity answer = new AnswerEntity();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        answer.setAuthor(author);
        this.answerRepository.save(answer);
        return answer;
    }

    public AnswerEntity getAnswer(Integer id) {
        Optional<AnswerEntity> answer = this.answerRepository.findById(id);
        if (answer.isPresent()) {
            return answer.get();
        } else {
            throw new DataNotFoundException("answer not found");
        }
    }

    public void modify(AnswerEntity answer, String content) {
        answer.setContent(content);
        answer.setModifyDate(LocalDateTime.now());
        this.answerRepository.save(answer);
    }

    public void delete(AnswerEntity answer) {
        this.answerRepository.delete(answer);
    }

    public void vote(AnswerEntity answer, SiteUser siteUser) {
        answer.getVoter().add(siteUser);
        this.answerRepository.save(answer);
    }
}
