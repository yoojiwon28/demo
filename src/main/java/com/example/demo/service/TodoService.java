package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.TodoEntity;
import com.example.demo.persistence.TodoRepository;


@Service
public class TodoService {

	@Autowired
	private TodoRepository repository;
	public String testService(){
		
		
		TodoEntity entity = TodoEntity.builder().userId("Yoo ji won").title("My first todo item").build();
				
		
		repository.save(entity);
		
		TodoEntity savedEntity = repository.searchByUserId(entity.getUserId()).get(0);
		return savedEntity.getUserId();
		
		
		
	}
	
	
}