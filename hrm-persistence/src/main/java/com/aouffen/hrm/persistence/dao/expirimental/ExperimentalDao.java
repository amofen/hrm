package com.aouffen.hrm.persistence.dao.expirimental;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.aouffen.hrm.persistence.entity.experimental.ExperimentalEntity;

@Named("ExperimentalDao")
public class ExperimentalDao {
	@PersistenceContext(unitName="business-unit")
	EntityManager em;
	@Transactional
	public ExperimentalEntity getExperimental(){
		ExperimentalEntity entity = new ExperimentalEntity("This is an experimental string");
		em.persist(entity);
		return entity;
		
	}

}
