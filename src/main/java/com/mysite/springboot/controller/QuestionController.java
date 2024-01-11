package com.mysite.springboot.controller;

import com.mysite.springboot.entity.QuestionEntity;
import com.mysite.springboot.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/list")
//    @ResponseBody //텍스트만 출력시 사용
    public String list(Model model){ //model을 매개변수 지정시, 객체 자동으로 생성됨
        List<QuestionEntity> questionList = this.questionService.getList(); //findAll 사용시 model 객체에 questionList 저장됨
        model.addAttribute("questionList",questionList);
        return "question_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {
        QuestionEntity question = this.questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question_detail.html";
    }
}