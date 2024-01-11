package com.mysite.springboot.controller;

import com.mysite.springboot.entity.QuestionEntity;
import com.mysite.springboot.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
    public final QuestionService questionService;
    public String createAnswer(Model model, @PathVariable("id") Integer id,
                               @RequestParam(value = "content") String content) {
        QuestionEntity questionEntity = this.questionService.getQuestion(id);
        return String.format("redirect:/question/detail/%s", id);
    }
}
