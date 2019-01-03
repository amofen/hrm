package com.aouffen.hrm.employee.api;

public interface EmployeeProvider {
	Employee findById(long id);
	void create(Employee employee);
	void update(Employee employee);
	void delete(long id);
}
