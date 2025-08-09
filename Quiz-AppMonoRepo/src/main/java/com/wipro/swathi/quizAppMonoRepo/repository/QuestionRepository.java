package com.wipro.swathi.quizAppMonoRepo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.swathi.quizAppMonoRepo.entities.Question;
import com.wipro.swathi.quizAppMonoRepo.enums.Category;
import com.wipro.swathi.quizAppMonoRepo.enums.DifficultyLevel;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	
	@Query(value="SELECT * FROM question q WHERE q.category= :category AND q.difficulty_level= :difficultyLevel ORDER BY RAND() LIMIT 5", nativeQuery = true)
	List<Question> findRandomQuestionsByCategoryAndLevel(
	   String category,
	    String difficultyLevel
	);

	List<Question> findByDifficultyLevel(DifficultyLevel difficultyLevel);

	List<Question> findByCategory(Category category);


//List<Question> findByDifficultyLevel(DifficultyLevel difficultyLevel);

}
