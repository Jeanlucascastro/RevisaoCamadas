package com.example.demo.dto;

import com.example.demo.entities.Users;

public class UserDTO {

	private Long id;
	private String name;
	
	public UserDTO () {
		
	}

	public UserDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public UserDTO(Users users) {
		id = users.getId();
		name = users.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
