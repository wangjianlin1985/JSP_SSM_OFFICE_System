package com.xafdy.dao;

import com.xafdy.model.UserSchedule;
import java.util.List;

public interface UserScheduleMapper {
	void saveEntity(UserSchedule userSchedule);
	
	List<UserSchedule> searchEntity(Integer id);
	
	void deleteEntity(Integer id);
	
	void updateEntity(UserSchedule UserSchedule);
	
	UserSchedule getEntityById(Integer id);
}