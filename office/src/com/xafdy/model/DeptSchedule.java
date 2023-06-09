package com.xafdy.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class DeptSchedule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_schedule.id
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_schedule.start_date
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date startDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_schedule.end_date
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date endDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_schedule.position
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_schedule.dept_id
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_schedule.content
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    private String content;
    
    private String deptName;
    
    private String start;
    
    private String end;
    
    
    
    public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_schedule.id
     *
     * @return the value of dept_schedule.id
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_schedule.id
     *
     * @param id the value for dept_schedule.id
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_schedule.start_date
     *
     * @return the value of dept_schedule.start_date
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_schedule.start_date
     *
     * @param startDate the value for dept_schedule.start_date
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_schedule.end_date
     *
     * @return the value of dept_schedule.end_date
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_schedule.end_date
     *
     * @param endDate the value for dept_schedule.end_date
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_schedule.position
     *
     * @return the value of dept_schedule.position
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_schedule.position
     *
     * @param position the value for dept_schedule.position
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_schedule.dept_id
     *
     * @return the value of dept_schedule.dept_id
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_schedule.dept_id
     *
     * @param deptId the value for dept_schedule.dept_id
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_schedule.content
     *
     * @return the value of dept_schedule.content
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_schedule.content
     *
     * @param content the value for dept_schedule.content
     *
     * @mbg.generated Wed Apr 11 20:22:07 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }
}