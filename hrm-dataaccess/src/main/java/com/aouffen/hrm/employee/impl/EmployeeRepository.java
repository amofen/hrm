package com.aouffen.hrm.employee.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.aouffen.hrm.employee.api.Employee;
import com.aouffen.hrm.employee.api.EmployeeProvider;
import com.aouffen.hrm.general.api.AbstractRepository;

@Named
public class EmployeeRepository extends AbstractRepository implements EmployeeProvider{

	@Inject
	private EmployeeDao employeeDao;
	

	@Override
	public Employee findById(long id) {
		EmployeeEntity employeeEntity = employeeDao.findById(id);
		return getBeanMapper().map(employeeEntity,Employee.class);
	}

	@Override
	public void create(Employee employee) {
		EmployeeEntity employeeEntity = getBeanMapper().map(employee, EmployeeEntity.class);
		this.employeeDao.create(employeeEntity);
		System.out.println("employee saved ! "+employeeEntity.getId());
	}

	@Override
	public void update(Employee employee) {
		EmployeeEntity employeeEntity = getBeanMapper().map(employee, EmployeeEntity.class);
		this.employeeDao.update(employeeEntity);
	}

	@Override
	public void delete(long id) {
		this.employeeDao.delete(id);
	}
}
