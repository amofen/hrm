package com.aouffen.hrm.leave.api;

public interface LeaveService {
	LeaveTo findById(long id);
	void create(LeaveTo leaveTo);
	void update(LeaveTo leaveTo);
	void delete(long id);

}
