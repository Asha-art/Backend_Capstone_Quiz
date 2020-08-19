package com.win.personality_quiz.controller;


import java.util.List;

import com.win.personality_quiz.model.Answer;

import com.win.personality_quiz.repository.AnswerRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
@CrossOrigin(origins = "http://localhost:3000")
public class AnswerController {

    @Autowired
    private AnswerRepo answerRepo;

    @GetMapping("/answers")
    public List<Answer> getQuestions() {
        return answerRepo.findAll();
    }

    // // save answers into database

    @PostMapping("/answers")
    public void addAnswer(@RequestBody Answer answers) {
        answerRepo.save(answers);

        // return "/QuizComponent.js";
    }
}
