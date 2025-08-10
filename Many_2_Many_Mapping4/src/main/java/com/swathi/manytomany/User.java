package com.swathi.manytomany;

import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;


@Entity
@Table(name="user_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToMany
	@JoinTable(name="user_post",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="post_id"))
	private List<Post> posts;
	

	public User() {
		super();
	}

	

}
