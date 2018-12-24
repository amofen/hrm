package com.aouffen.hrm.dataaccess.entitymanagement.api;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractDao <T extends AbstractEntity> {
	
	
	protected EntityManager em;
	
	public abstract Class<T> getClassType();
	
	public abstract  List<T> findByCriteria(CriteriaQuery<T> searchCriteria);
	
	public T create(T entity) {
		this.em.persist(entity);
		return entity;
	}
	
	public T update(T entity) {
		this.em.persist(entity);
		return entity;
	}
	
	public void delete(long id) throws InstantiationException, IllegalAccessException {
		T entity = this.getClassType().newInstance();
		entity.setId(id);
		this.delete(entity);
	}
	
	public void delete(T entity) {
		this.em.remove(entity);
	}
	
	public T findById(long id) {
		return this.em.find(getClassType(), id);
	}
	
}
