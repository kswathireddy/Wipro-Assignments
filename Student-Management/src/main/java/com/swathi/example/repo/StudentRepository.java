package com.swathi.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swathi.example.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
