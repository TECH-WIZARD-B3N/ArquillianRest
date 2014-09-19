package de.cofinpro.rest;

import java.util.List;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.spi.HttpRequest;

import de.cofinpro.rest.model.User;

public class CustomerResourceImpl implements CustomerResource {

    @Context
    private HttpRequest httpServletRequest;
	
	@Override
	public List<User> getAllTechis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllFachis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getTechiById(long id) {
		
		if(id == 1L) {
			User user = new User();
			user.setId(1L);
			user.setName("Michi");
			return user;
		}
		
		return null;
	}

	@Override
	public Response addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
