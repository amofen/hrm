package com.aouffen.hrm.leave.api;

import java.util.Date;

import com.aouffen.hrm.employee.api.Employee;
import com.aouffen.hrm.employee.api.IEmployee;

public class Leave implements ILeave{
	long id;
	private Date startDate;
	private Date endDate;
	private Employee employee;
	private String type;
	
	public Leave() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public IEmployee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
