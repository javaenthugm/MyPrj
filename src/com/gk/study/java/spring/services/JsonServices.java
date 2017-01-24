package com.gk.study.java.spring.services;

import java.util.List;

import com.gk.study.java.hibernate.model.User;
import com.google.gson.Gson;

public class JsonServices {
	
	public static String getAllUsers(List<User> list){
		Gson gson = new Gson();
		return gson.toJson(list);
	}

}
