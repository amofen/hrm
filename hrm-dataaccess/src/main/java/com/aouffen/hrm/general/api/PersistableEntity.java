package com.aouffen.hrm.general.api;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PersistableEntity {
	@Id
	@GeneratedValue
	private long id;

	public PersistableEntity() {

	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}
}
