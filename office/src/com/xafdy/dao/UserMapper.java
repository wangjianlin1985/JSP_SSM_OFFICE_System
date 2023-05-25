package com.xafdy.dao;

import java.util.List;
import java.util.Map;

import com.xafdy.model.User;


public interface UserMapper {
	void saveEntity(User user);
	
	List<User> searchEntity();
	
	void deleteEntity(Integer id);
	
	void updateEntity(User user);
	
	User getEntityById(Integer id);
	
	User userLogon(Map<String, Object> map);
	
}