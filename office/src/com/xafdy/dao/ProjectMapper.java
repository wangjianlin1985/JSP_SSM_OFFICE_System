package com.xafdy.dao;

import com.xafdy.model.Project;

import java.util.List;

public interface ProjectMapper {
	void saveEntity(Project project);
	
	List<Project> searchEntity();
	
	void deleteEntity(Integer id);
	
	void updateEntity(Project project);
	
	Project getEntityById(Integer id);
}