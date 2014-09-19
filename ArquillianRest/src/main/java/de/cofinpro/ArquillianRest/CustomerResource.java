package de.cofinpro.ArquillianRest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.cofinpro.ArquillianRest.User;

@Path("/cofinpro")
public interface CustomerResource {

	@POST
	@Path("/login")
	Response login();
	
	@GET
	@Path("/techiUser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	List<User> getAllTechis();
	
	@GET
	@Path("/fachiUser")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	List<User> getAllFachis();
	
	@GET
	@Path("/techiUser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	User getTechiById(@PathParam("id") long id);
	
	@POST
	@Path("/createUser")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	User createUser(String name, String adress);
}

