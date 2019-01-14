package com.aouffen.hrm.leave.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import com.aouffen.hrm.general.impl.BusinessDao;

public class LeaveDao extends BusinessDao<LeaveEntity>{

	@Override
	public Class<LeaveEntity> getClassType() {
		return LeaveEntity.class;
	}

	@Override
	public List<LeaveEntity> findByCriteria(CriteriaQuery<LeaveEntity> searchCriteria) {
		// TODO Auto-generated method stub
		return null;
	}

}
