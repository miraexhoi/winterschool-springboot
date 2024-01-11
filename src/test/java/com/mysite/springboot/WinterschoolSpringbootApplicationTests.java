package com.mysite.springboot;

import com.mysite.springboot.entity.QuestionEntity;
import com.mysite.springboot.repository.AnswerRepository;
import com.mysite.springboot.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

@SpringBootTest
class WinterschoolSpringbootApplicationTests {
    @Autowired //생성자 없이 자동으로 내용 밀어줌
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() { // 테스트하는 메소드를 의미
        //junit으로 실행됨


    }

}

//QUESTION
//Create

//                Question q1 = new Question();
//                q1.setSubject("sbb가 무엇인가요?");
//                q1.setContent("sbb에 대하여 알고싶습니다.");
//                q1.setCreateDate(LocalDateTime.now());
//                this.questionRepository.save(q1);
//
//                Question q2 = new Question();
//                q2.setSubject("스프링부트 모델 질문입니다.");
//                q2.setContent("id는 자동으로 생성되나요?");
//                q2.setCreateDate(LocalDateTime.now());
//                this.questionRepository.save(q2);
//


//Read
//                List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");//데이터가 여러개일 수도 있으니 리스트로 생성
//                                                                    //sbb% = sbb로 시작하는 문자열
//                                                                    //%sbb = sbb로 끝나는 문자열
//                                                                    //%sbb% = sbb가 포함된 문자열
//                Question q = qList.get(0);
//                assertEquals("sbb가 무엇인가요?",q.getSubject());


//Update
//Optional<Question> oq = questionRepository.findById(1);
//        //optional 는 값이 있을지 없을지 몰라 사용한다
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);


//Delete
//assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1,this.questionRepository.count());


//ANSWER
//Create
//Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("자동으로 생성됩니다");
//        a.setQuestion(q);
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);


//Read
//Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2,a.getQuestion().getId());