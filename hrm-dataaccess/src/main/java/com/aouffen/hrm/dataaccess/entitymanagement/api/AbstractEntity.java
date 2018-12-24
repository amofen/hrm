package com.aouffen.hrm.dataaccess.entitymanagement.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class AbstractEntity {
	@Id
	@GeneratedValue
	private long id;

	public AbstractEntity() {

	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}
}
