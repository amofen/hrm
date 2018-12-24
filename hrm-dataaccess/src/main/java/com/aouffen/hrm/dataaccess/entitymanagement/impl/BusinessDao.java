package com.aouffen.hrm.dataaccess.entitymanagement.impl;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.aouffen.hrm.dataaccess.entitymanagement.api.AbstractDao;

public abstract class BusinessDao <T extends BusinessEntity> extends AbstractDao<T> {

	@PersistenceContext(unitName="business-unit")
	private void setEntityManager(EntityManager entityManager) {
		em = entityManager;
	}

}
