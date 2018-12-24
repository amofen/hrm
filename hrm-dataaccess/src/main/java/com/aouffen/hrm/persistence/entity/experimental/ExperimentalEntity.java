package com.aouffen.hrm.persistence.entity.experimental;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Experimental")
public class ExperimentalEntity {
	@Id
	@GeneratedValue
	private int id;
	private String something;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}

	
	
	public ExperimentalEntity() {
		super();
	}
	
	public ExperimentalEntity(String something) {
		super();
		this.something = something;
	}
	
	
}
