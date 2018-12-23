package com.aouffen.hrm.persistence.dao.expirimental;

import javax.inject.Named;

import com.aouffen.hrm.persistence.entity.experimental.ExperimentalEntity;

@Named("ExperimentalDao")
public class ExperimentalDao {
	public ExperimentalEntity getExperimental(){
		return new ExperimentalEntity("This is an experimental string");
		
	}

}
