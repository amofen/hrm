package com.aouffen.hrm.api.resource.exprimental;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.aouffen.hrm.service.experimental.ExperimentalService;

@Path("/exp_resource")
public class ExperimentalResource {
	@Inject
	ExperimentalService experimentalService;
	@Path("/")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getSomething() {
		return Response.ok().entity(experimentalService.getExperimental().getSomething()).build();
	}

}
