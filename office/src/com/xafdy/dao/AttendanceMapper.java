package com.xafdy.dao;

import com.xafdy.model.Attendance;
import java.util.List;

public interface AttendanceMapper {
	void saveEntity(Attendance attendance);
	
	List<Attendance> searchEntity();
}