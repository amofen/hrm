package com.aouffen.hrm.employee.api;

import java.util.Date;

public interface IEmployee {
	String getFirstName();
	String getLastName();
	Date getBirthDate();
	Date getHireDate();
	String getFunction();
	String getAdress();
	String getCode();

}
