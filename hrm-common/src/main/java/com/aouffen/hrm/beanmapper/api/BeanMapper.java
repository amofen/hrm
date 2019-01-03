package com.aouffen.hrm.beanmapper.api;

public interface BeanMapper {
	<T> T map(Object source, Class<T> destination);
}
