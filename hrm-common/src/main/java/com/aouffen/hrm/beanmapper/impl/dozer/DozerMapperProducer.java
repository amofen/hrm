package com.aouffen.hrm.beanmapper.impl.dozer;

import javax.enterprise.inject.Produces;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;


public class DozerMapperProducer {
	@Produces 
	public Mapper getMapper() {
		Mapper mapper = DozerBeanMapperBuilder.buildDefault();
		return mapper;
	}
}
