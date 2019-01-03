package com.aouffen.hrm.general.api;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aouffen.hrm.beanmapper.api.BeanMapper;

public abstract class AbstractManager {
	Logger logger =LoggerFactory.getLogger(this.getClass());
	@Inject
	private BeanMapper beanMapper;
	
	
	protected BeanMapper getBeanMapper() {
		return this.beanMapper;
	}
	
	protected Logger getLogger() {
		return this.logger;
	}
}
