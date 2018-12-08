package com.aouffen.hrm.model.employee;

import java.util.Date;

public class Employee {
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String currentFunctionTitle;
	private String sex;
	private String latestDiplomaTitle;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCurrentFunctionTitle() {
		return currentFunctionTitle;
	}
	public void setCurrentFunctionTitle(String currentFunctionTitle) {
		this.currentFunctionTitle = currentFunctionTitle;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLatestDiplomaTitle() {
		return latestDiplomaTitle;
	}
	public void setLatestDiplomaTitle(String latestDiplomaTitle) {
		this.latestDiplomaTitle = latestDiplomaTitle;
	}
}
