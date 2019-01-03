package com.aouffen.hrm.employee.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.aouffen.hrm.employee.api.Employee;
import com.aouffen.hrm.employee.api.EmployeeProvider;
import com.aouffen.hrm.employee.api.EmployeeService;
import com.aouffen.hrm.employee.api.EmployeeTo;
import com.aouffen.hrm.general.api.AbstractManager;
@Named
public class EmployeeManager extends AbstractManager implements EmployeeService{
	
	@Inject
	EmployeeProvider employeeProvider;

	@Override
	public EmployeeTo findById(long id) {
		Employee employee = this.employeeProvider.findById(id);
		return getBeanMapper().map(employee, EmployeeTo.class);
	}

	@Override
	public void create(EmployeeTo employeeTo) {
		Employee employee =getBeanMapper().map(employeeTo,Employee.class);
		this.employeeProvider.create(employee);
		
	}


	@Override
	public void update(EmployeeTo employeeTo) {
		Employee employee =getBeanMapper().map(employeeTo,Employee.class);
		this.employeeProvider.update(employee);
		
	}

	@Override
	public void delete(long id) {
		this.employeeProvider.delete(id);
		
	}
	
	
	
	

}
