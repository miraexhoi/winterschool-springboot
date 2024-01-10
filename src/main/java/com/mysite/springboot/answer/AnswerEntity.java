package com.mysite.springboot.answer;

import com.mysite.springboot.question.QuestionEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class AnswerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String Content;

    private LocalDateTime createDate;

    // N:1
    @ManyToOne
    private QuestionEntity question;
}
