package com.mysite.springboot;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
}
