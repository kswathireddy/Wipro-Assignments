package com.wipro.swathi.userapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.swathi.userapp.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	Page<User> findByNameIgnoreCase(String name, Pageable pageable);

}
