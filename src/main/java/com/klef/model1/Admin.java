package com.klef.model1;

import jakarta.persistence.*;

@Entity
@Table(name="Admin_table")
public class Admin {

	@Id
	@Column(name="admin_username",length = 10)
	private String username;
	@Column(name="admin_password",length = 10,nullable = false)
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
