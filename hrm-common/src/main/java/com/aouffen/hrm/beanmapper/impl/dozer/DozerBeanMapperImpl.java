package com.aouffen.hrm.beanmapper.impl.dozer;

import javax.inject.Inject;
import javax.inject.Named;

import com.aouffen.hrm.beanmapper.api.BeanMapper;
import com.github.dozermapper.core.Mapper;

@Named
public class DozerBeanMapperImpl implements BeanMapper {
	@Inject
	Mapper mapper;

	@Override
	public <T> T map(Object source, Class<T> destination) {
		return this.mapper.map(source, destination);
	}
}
