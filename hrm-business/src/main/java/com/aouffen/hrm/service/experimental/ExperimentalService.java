package com.aouffen.hrm.service.experimental;


import javax.inject.Inject;
import javax.inject.Named;

import com.aouffen.hrm.model.experimental.Experimental;
import com.aouffen.hrm.persistence.dao.expirimental.ExperimentalDao;

@Named("ExperimentalService")
public class ExperimentalService {
	@Inject
	ExperimentalDao experimentalDao;

	public Experimental getExperimental() {
		return new Experimental(experimentalDao.getExperimental().getSomething());
	}

}
