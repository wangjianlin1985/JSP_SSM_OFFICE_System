package com.xafdy.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xafdy.dao.AttendanceMapper;
import com.xafdy.dao.DeptMapper;
import com.xafdy.dao.DeptScheduleMapper;
import com.xafdy.dao.EducationMapper;
import com.xafdy.dao.NationalMapper;
import com.xafdy.dao.NewsMapper;
import com.xafdy.dao.ProjectMapper;
import com.xafdy.dao.UserMapper;
import com.xafdy.dao.UserScheduleMapper;
import com.xafdy.model.Attendance;
import com.xafdy.model.Dept;
import com.xafdy.model.DeptSchedule;
import com.xafdy.model.Education;
import com.xafdy.model.National;
import com.xafdy.model.News;
import com.xafdy.model.Project;
import com.xafdy.model.User;
import com.xafdy.model.UserSchedule;

@Service("index")
public class IndexService {
	@Resource
	private UserMapper userMapper;
	
	@Resource
	private DeptMapper deptMapper;
	
	@Resource
	private EducationMapper educationMapper;
	
	@Resource
	private NationalMapper nationalMapper;
	
	@Resource
	private DeptScheduleMapper deptScheduleMapper;
	
	@Resource
	private NewsMapper newsMapper;
	
	@Resource
	private AttendanceMapper attendanceMapper;
	
	@Resource
	private ProjectMapper projectMapper;
	
	@Resource
	private UserScheduleMapper userScheduleMapper;
	
	public void saveUser(User user) {
		userMapper.saveEntity(user);
	}
	
	public List<Dept> getDepts() {
		return deptMapper.searchEntity();
	}
	
	public List<National> getNationals() {
		return nationalMapper.searchEntity();
	}
	
	public List<Education> getEducation() {
		return educationMapper.searchEntity();
	}
	
	public void updateUser(User user) {
		userMapper.updateEntity(user);
	}
	
	public User getUserById(Integer id) {
		return userMapper.getEntityById(id);
	}
	
	public List<User> getUsers() {
		return userMapper.searchEntity();
	}
	
	public void deleteUsers(Integer id) {
		userMapper.deleteEntity(id);
	}
	
	public void saveDept(Dept dept) {
		deptMapper.saveEntity(dept);
	}
	
	public void updateDept(Dept dept) {
		deptMapper.updateEntity(dept);
	}
	
	public Dept getDeptById(Integer id) {
		return deptMapper.getEntityById(id);
	}
	
	public void deleteDept(Integer id) {
		deptMapper.deleteEntity(id);
	}
	
	
	
	
	
	public void saveDeptSchedule(DeptSchedule deptSchedule) {
		deptScheduleMapper.saveEntity(deptSchedule);
	}
	
	public void updateDeptSchedule(DeptSchedule deptSchedule) {
		deptScheduleMapper.updateEntity(deptSchedule);
	}
	
	public DeptSchedule getDeptScheduleById(Integer id) {
		return deptScheduleMapper.getEntityById(id);
	}
	
	public List<DeptSchedule> getDeptSchedules() {
		return deptScheduleMapper.searchEntity();
	}
	
	public void deleteDeptSchedule(Integer id) {
		deptScheduleMapper.deleteEntity(id);
	}
	
	
	
	
	public void saveNews(News news) {
		newsMapper.saveEntity(news);
	}
	
	public void updateNews(News news) {
		newsMapper.updateEntity(news);
	}
	
	public News getNewsById(Integer id) {
		return newsMapper.getEntityById(id);
	}
	
	public List<News> getNews() {
		return newsMapper.searchEntity();
	}
	
	public void deleteNews(Integer id) {
		newsMapper.deleteEntity(id);
	}
	
	
	public void saveAttendence(Attendance attendance) {
		attendanceMapper.saveEntity(attendance);
	}
	
	public List<Attendance> getAttendance() {
		return attendanceMapper.searchEntity();
	}
	
	public void saveProject(Project project) {
		projectMapper.saveEntity(project);
	}
	
	public void updateProject(Project project) {
		projectMapper.updateEntity(project);
	}
	
	public Project getProjectById(Integer id) {
		return projectMapper.getEntityById(id);
	}
	
	public List<Project> getProject() {
		return projectMapper.searchEntity();
	}
	
	public void deleteProject(Integer id) {
		projectMapper.deleteEntity(id);
	}
	
	
	public void saveUserSchedule(UserSchedule userSchedule) {
		userScheduleMapper.saveEntity(userSchedule);
	}
	
	public void updateUserSchedule(UserSchedule userSchedule) {
		userScheduleMapper.updateEntity(userSchedule);
	}
	
	public UserSchedule getUserScheduleById(Integer id) {
		return userScheduleMapper.getEntityById(id);
	}
	
	public List<UserSchedule> getUserSchedules(Integer id) {
		return userScheduleMapper.searchEntity(id);
	}
	
	public void deleteUserSchedule(Integer id) {
		userScheduleMapper.deleteEntity(id);
	}
	
	public User userLogon(Map<String, Object> map) {
		return userMapper.userLogon(map);
	}
}
