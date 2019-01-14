package com.aouffen.hrm.leave.impl;

import javax.inject.Inject;

import com.aouffen.hrm.general.api.AbstractRepository;
import com.aouffen.hrm.leave.api.Leave;
import com.aouffen.hrm.leave.api.LeaveProvider;

public class LeaveRepository extends AbstractRepository implements LeaveProvider{

	@Inject
	private LeaveDao leaveDao;
	
	@Override
	public Leave findById(long id) {
		LeaveEntity leaveEntity = leaveDao.findById(id);
		Leave leave = getBeanMapper().map(leaveEntity, Leave.class);
		return leave;
	}

	@Override
	public void create(Leave leave) {
		LeaveEntity leaveEntity = getBeanMapper().map(leave, LeaveEntity.class);
		leaveDao.create(leaveEntity);
		
	}

	@Override
	public void update(Leave leave) {
		LeaveEntity leaveEntity =getBeanMapper().map(leave, LeaveEntity.class);
		leaveDao.update(leaveEntity);
		
	}

	@Override
	public void delete(long id) {
		leaveDao.delete(id);		
	}

}
