package com.aouffen.hrm.service.experimental;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.aouffen.hrm.model.experimental.Experimental;
import com.aouffen.hrm.persistence.dao.expirimental.ExperimentalDao;

@Stateless
public class ExperimentalService {
	@Inject
	ExperimentalDao experimentalDao;

	public Experimental getExperimental() {
		return new Experimental(experimentalDao.getExperimental().getSomthing());
	}

}
