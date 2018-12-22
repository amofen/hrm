package com.aouffen.hrm.api.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.aouffen.hrm.api.resource.exprimental.ExperimentalResource;


@ApplicationPath("/v1")
public class AppConfig extends Application{
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		
		resources.add(ExperimentalResource.class);

		return resources;
	}

	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		singletons.add(new ExperimentalResource());
		return singletons;
	}
}
