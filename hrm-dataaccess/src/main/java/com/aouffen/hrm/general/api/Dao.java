package com.aouffen.hrm.general.api;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
@Transactional
public abstract class Dao <T extends PersistableEntity> {
	
	
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

	public void delete(long id)  {
		T entity = this.findById(id);
		this.delete(entity);		
	}

	public void delete(T entity) {
		this.em.remove(this.em.contains(entity)? this.em.merge(entity):entity);
	}
	
	public T findById(long id) {
		return this.em.find(getClassType(), id);
	}
	
}
