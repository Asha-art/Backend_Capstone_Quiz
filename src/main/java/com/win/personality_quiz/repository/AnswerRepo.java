package com.win.personality_quiz.repository;

import com.win.personality_quiz.model.Answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepo extends JpaRepository<Answer, Long> {
    // List<Answer> findByAnswers(Answer answers);
}