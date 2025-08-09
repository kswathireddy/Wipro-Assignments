package com.wipro.swathi.quizAppMonoRepo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.swathi.quizAppMonoRepo.entities.Question;
import com.wipro.swathi.quizAppMonoRepo.enums.Category;
import com.wipro.swathi.quizAppMonoRepo.enums.DifficultyLevel;

public interface QuestionService {

	Question save(Question question);

	List<Question> findAll();

	List<Question> findByCategory(Category category);



	

	Question findById(Long id);

	List<Question> findByDifficultyLevel(DifficultyLevel difficultyLevel);

	void deleteById(Long id);

	

	Page<Question> findAlls(Pageable pageable);

	Question findById(Long id, Question question);

	Question getPatch(Long id, Question question);


	

	

}
