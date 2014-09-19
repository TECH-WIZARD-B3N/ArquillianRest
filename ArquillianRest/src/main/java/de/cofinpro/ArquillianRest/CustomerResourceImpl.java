package de.cofinpro.ArquillianRest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.spi.HttpRequest;

import de.cofinpro.ArquillianRest.User;

public class CustomerResourceImpl implements CustomerResource {

	@Context
	private HttpRequest httpServletRequest;

	public List<User> getAllTechis() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllFachis() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getTechiById(long id) {

		if (id == 1L) {
			User user = new User();
			user.setId(1L);
			user.setName("Michi");
			return user;
		}

		return null;
	}

	public User createUser(String name, String adress) {
		
		if(name != null && adress != null) {
			User user = new User();
			user.setName(name);
			user.setAdress(adress);
			return user;
		}
		
		return null;
	}

	public Response login() {
		
		return null;
	}

}
