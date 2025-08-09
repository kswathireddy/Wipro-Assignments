package com.wipro.swathi.quizAppMonoRepo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.swathi.quizAppMonoRepo.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
