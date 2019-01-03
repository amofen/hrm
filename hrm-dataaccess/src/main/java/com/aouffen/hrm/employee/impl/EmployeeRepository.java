package com.aouffen.hrm.employee.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.aouffen.hrm.beanmapper.api.BeanMapper;
import com.aouffen.hrm.employee.api.Employee;
import com.aouffen.hrm.employee.api.EmployeeProvider;

@Named
public class EmployeeRepository implements EmployeeProvider{

	@Inject
	private EmployeeDao employeeDao;
	
	@Inject
	private BeanMapper beanMapper;

	@Override
	public Employee findById(long id) {
		EmployeeEntity employeeEntity = employeeDao.findById(id);
		return this.beanMapper.map(employeeEntity,Employee.class);
	}

	@Override
	public void create(Employee employee) {
		EmployeeEntity employeeEntity = this.beanMapper.map(employee, EmployeeEntity.class);
		this.employeeDao.create(employeeEntity);
		System.out.println("employee saved ! "+employeeEntity.getId());
	}

	@Override
	public void update(Employee employee) {
		EmployeeEntity employeeEntity = this.beanMapper.map(employee, EmployeeEntity.class);
		this.employeeDao.update(employeeEntity);
	}

	@Override
	public void delete(long id) {
		this.employeeDao.delete(id);
	}
}
