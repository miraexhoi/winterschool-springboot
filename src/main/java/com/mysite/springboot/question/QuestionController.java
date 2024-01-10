package com.mysite.springboot.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class QuestionController {
    private final QuestionService questionService;
    @GetMapping("/question/list")
    @ResponseBody
    public String list(Model model) {
        List<QuestionEntity> questionEntityList = this.questionService.getList();
        model.addAttribute("quesitonList",questionEntityList);
        return "question_list";
    }
}
