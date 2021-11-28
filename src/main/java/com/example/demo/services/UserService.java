package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.UserDTO;
import com.example.demo.entities.Users;
import com.example.demo.repositories.UserReposity;

@Service
public class UserService {
	
	@Autowired
	private UserReposity repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Users entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}

}
