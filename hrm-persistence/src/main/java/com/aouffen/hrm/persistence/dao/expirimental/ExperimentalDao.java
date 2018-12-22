package com.aouffen.hrm.persistence.dao.expirimental;

import javax.ejb.Stateless;

import com.aouffen.hrm.persistence.entity.experimental.ExperimentalEntity;

@Stateless
public class ExperimentalDao {
	public ExperimentalEntity getExperimental(){
		return new ExperimentalEntity("This is an experimental string");
		
	}

}
