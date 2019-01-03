package com.aouffen.hrm.employee.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.aouffen.hrm.general.impl.BusinessDao;

public class EmployeeDao extends BusinessDao<EmployeeEntity>{

	@Override
	public Class<EmployeeEntity> getClassType() {
		return EmployeeEntity.class;
	}

	@Override
	public List<EmployeeEntity> findByCriteria(CriteriaQuery<EmployeeEntity> searchCriteria) {
		// TODO Search for employee by criteria
		return null;
	}

}
