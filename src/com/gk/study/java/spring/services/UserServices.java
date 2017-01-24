package com.gk.study.java.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gk.study.java.hibernate.dao.UserDao;
import com.gk.study.java.hibernate.model.User;

@Component
public class UserServices {
	
	
	@Autowired
	private UserDao udao;
	
	public String getAllUsers(){
		List<User> ulist= udao.getAllUsers();
		return JsonServices.getAllUsers(ulist);
	}

	public UserDao getUdao() {
		return udao;
	}

	public void setUdao(UserDao udao) {
		this.udao = udao;
	}
	
	

}
