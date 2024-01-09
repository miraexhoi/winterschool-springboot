package com.mysite.springboot.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class QuestionEntity {

    // id : id 속성을 기본키로 지정, id 속성의 고유 번호들은 엔티티에서 각 데이터들을 구분하는 유효한 값 -> 중복 x
    // strategy = GenerationType.IDENTITY : 고유한 번호를 생성하는 방법을 지정하는 부분
    // GenerationType.IDENTITY : 해당 속성만 별도로 번호가 차례대로 늘어나도록 할 때 사용
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 길이 제한
    @Column(length = 200)
    private String subject;

    // 타입 제한
    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    // 1:N
    // CascadeType.REMOVE : 질문을 삭제하면 그에 달린 답변들도 함께 삭제
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<AnswerEntity> answerList;
}
