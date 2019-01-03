package com.aouffen.hrm.general.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.aouffen.hrm.general.api.Dao;

public abstract class BusinessDao <T extends BusinessEntity> extends Dao<T> {

	@PersistenceContext(unitName="business-unit")
	private void setEntityManager(EntityManager entityManager) {
		em = entityManager;
	}

}
