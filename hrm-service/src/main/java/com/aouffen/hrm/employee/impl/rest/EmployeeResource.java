package com.aouffen.hrm.employee.impl.rest;

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

import com.aouffen.hrm.employee.api.EmployeeService;
import com.aouffen.hrm.employee.api.EmployeeTo;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource  {
	@Inject
	EmployeeService employeeService;
	
	@GET
	@Path("/{id}")
	public Response findById(@PathParam(value = "id") long id) {
		return Response.ok().entity(this.employeeService.findById(id)).build();
	}
	
	@POST
	@Path("/")
	public Response create(EmployeeTo employeeTo) {
		this.employeeService.create(employeeTo);
		return Response.ok().entity(employeeTo).build();
	}
	
	@PUT
	@Path("/{id}")
	public Response update(@PathParam(value = "id") long id,EmployeeTo employeeTo) {
		this.employeeService.update(employeeTo);
		return Response.ok().entity(employeeTo).build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam(value = "id") long id ) {
		this.employeeService.delete(id);
		return Response.ok().build();
	}
}
