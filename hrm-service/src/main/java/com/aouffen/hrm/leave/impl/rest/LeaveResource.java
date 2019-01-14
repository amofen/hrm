package com.aouffen.hrm.leave.impl.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.aouffen.hrm.leave.api.LeaveService;
import com.aouffen.hrm.leave.api.LeaveTo;

@Path("/leave")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LeaveResource {
	@Inject
	LeaveService leaveService;
	
	@GET
	@Path("/{id}")
	public Response findById(@PathParam(value = "id") long id) {
		return Response.ok().entity(this.leaveService.findById(id)).build();
	}
	
	@POST
	@Path("/")
	public Response create(LeaveTo leaveTo) {
		this.leaveService.create(leaveTo);
		return Response.ok().entity(leaveTo).build();
	}
	
	@PUT
	@Path("/{id}")
	public Response update(@PathParam(value = "id") long id,LeaveTo leaveTo) {
		this.leaveService.update(leaveTo);
		return Response.ok().entity(leaveTo).build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam(value = "id") long id ) {
		this.leaveService.delete(id);
		return Response.ok().build();
	}
}
