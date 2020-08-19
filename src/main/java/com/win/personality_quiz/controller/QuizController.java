package com.win.personality_quiz.controller;

import java.util.Collection;

import com.win.personality_quiz.model.Quiz;

import com.win.personality_quiz.repository.QuizRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
@CrossOrigin(origins = "http://localhost:3000")
public class QuizController {

    @Autowired
    private QuizRepo quizRepo;

    @GetMapping("/questions")
    public Collection<Quiz> getQuestions() {
        return quizRepo.findAll();
    }

    // @GetMapping("questions")
    // public ResponseEntity<Object> getQuestions() {
    // return new ResponseEntity<>(quizService.getQuestions(), HttpStatus.OK);
    // }

    // save answers into database
    // @CrossOrigin(origins = "http://localhost:3000")
    // @PostMapping("answers")
    // public void addAnswer(@RequestBody Answer answers) {
    // System.out.println(answers);
    // answerRepo.save(answers);
    // // return "QuizComponent";
    // }
}