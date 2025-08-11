package com.nitish.tutrest;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("user")
public class UserResource {
	
	UserRepo users= new UserRepo();

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<UserDetail> getUsers() {
		
		return users.getUsers();
	}

	
	@GET
	@Path("username/{name}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public UserDetail getUserByName(@PathParam("name") String name) {

		return users.getUserByName(name);
	}

	@POST
	@Path("adduser")
	public UserDetail addUser(UserDetail user) {

		users.addUserDetail(user);
		System.out.println(user);
		return user;
	}

	public UserDetail updateUser(UserDetail user) {

		return users.updateUser(user);
		
	}

	public UserDetail deleteUser(UserDetail user) {

		return users.deleteUser(user);
	}

}
