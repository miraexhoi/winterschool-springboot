package com.mysite.springboot;

import com.mysite.springboot.domain.AnswerEntity;
import com.mysite.springboot.domain.QuestionEntity;
import com.mysite.springboot.repository.AnswerRepository;
import com.mysite.springboot.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class WinterschoolSpringbootApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJPA() {
        Optional<QuestionEntity> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent()); // 값이 있는지 없는지 체크
        QuestionEntity q = oq.get();

        AnswerEntity a = new AnswerEntity();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);

//        assertEquals(2, this.questionRepository.count());
//        Optional<QuestionEntity> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        QuestionEntity q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());

//        Optional<QuestionEntity> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        QuestionEntity q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);

//        List<QuestionEntity> qList = this.questionRepository.findBySubjectLike("sbb%");
//        QuestionEntity q = qList.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());


//        Optional<QuestionEntity> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()) {
//            QuestionEntity q = oq.get();
//            assertEquals("sbb가 무엇인가요?", q.getSubject());
//        }

//        List<QuestionEntity> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        QuestionEntity q = all.get(0);
//        assertEquals("springboot가 무엇인가요?", q.getSubject());

//        QuestionEntity q1 = new QuestionEntity();
//        q1.setSubject("springboot가 무엇인가요?");
//        q1.setContent("springboot에 대해 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1); // 첫번째 질문 저장
//
//        QuestionEntity q2 = new QuestionEntity();
//        q2.setSubject("springboot 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);
    }

}
