package com.prashant.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.prashant.Ticket;

@Path("/json/zendesk")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Ticket getTicketInJSON() {

		Ticket ticket = new Ticket();
		ticket.setUser("Prashant");
		ticket.setDescription("Test ticket");

		return ticket;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTicketInJSON(Ticket ticket) {

		String result = "ticket created : " + ticket;
		return Response.status(201).entity(result).build();
		
	}
	
}