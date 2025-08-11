package com.nitish.tutrest;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
	
	 private List<UserDetail> users;
	
	public UserRepo() {
		this.users= new ArrayList<UserDetail>();
		
		UserDetail u1=new UserDetail("Nitish", "aastha");
		UserDetail u2=new UserDetail("Aastha", "nitish");
		this.users.add(u1);
		this.users.add(u2);
	}
	
	
	public   List<UserDetail> getUsers(){
		return this.users;
	}
	
	public UserDetail getUserByName(String name) {
		
		for(UserDetail user:this.users) {
			if (user.getUser_name().equals(name))
				return user;
		}
		return null;
	}
	
	public UserDetail addUserDetail(UserDetail user) {
		users.add(user);
		return user;
	}
	
	public UserDetail updateUser(UserDetail user) {
		return user;
	}
	
	public UserDetail deleteUser(UserDetail user) {
		return user;
	}
	
}
