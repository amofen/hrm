package com.aouffen.hrm.leave.api;

import java.util.Date;

import com.aouffen.hrm.employee.api.IEmployee;

public interface ILeave {
	long getId();
	Date getStartDate();
	Date getEndDate();
	IEmployee getEmployee();
	String getType();
	int getLength();
}
