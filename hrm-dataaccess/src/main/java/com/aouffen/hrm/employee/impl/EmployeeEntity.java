package com.aouffen.hrm.employee.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.aouffen.hrm.employee.api.IEmployee;
import com.aouffen.hrm.general.impl.BusinessEntity;

@Entity
@Table(name="employee")
public class EmployeeEntity extends BusinessEntity implements IEmployee{
	private String code;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	private String function;
	private String adress;
	
	public EmployeeEntity() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	
}
