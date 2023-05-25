package com.xafdy.dao;

import com.xafdy.model.Dept;
import java.util.List;

public interface DeptMapper {
	void saveEntity(Dept dept);
	
	List<Dept> searchEntity();
	
	void deleteEntity(Integer id);
	
	void updateEntity(Dept dept);
	
	Dept getEntityById(Integer id);
}