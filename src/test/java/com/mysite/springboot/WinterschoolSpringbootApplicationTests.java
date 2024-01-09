package com.mysite.springboot;

import com.mysite.springboot.domain.QuestionEntity;
import com.mysite.springboot.repository.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

@SpringBootTest
class WinterschoolSpringbootApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJPA() {
        List<QuestionEntity> all = this.questionRepository.findAll();
        assertEquals(2, all.size());

        QuestionEntity q = all.get(0);
        assertEquals("springboot가 무엇인가요?", q.getSubject());

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
