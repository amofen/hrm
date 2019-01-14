package com.aouffen.hrm.leave.api;

public interface LeaveProvider {
	Leave findById(long id);
	void create(Leave leave);
	void update(Leave leave);
	void delete(long id);
}
