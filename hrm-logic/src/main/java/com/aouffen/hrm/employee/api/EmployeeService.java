package com.aouffen.hrm.employee.api;

public interface EmployeeService {
	EmployeeTo findById(long id);
	void create(EmployeeTo employee);
	void update(EmployeeTo employee);
	void delete(long id);
}
