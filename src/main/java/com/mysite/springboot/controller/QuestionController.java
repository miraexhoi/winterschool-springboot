package com.mysite.springboot.controller;

import com.mysite.springboot.entity.QuestionEntity;
import com.mysite.springboot.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {
    private final QuestionService questionService;
    @GetMapping("/list")
    public String list(Model model) {
        List<QuestionEntity> questionEntityList = this.questionService.getList();
        model.addAttribute("quesitonList",questionEntityList);
        return "question_list";
    }
}
