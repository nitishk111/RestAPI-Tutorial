package com.nitish.tutrest;

import jakarta.json.bind.annotation.JsonbAnnotation;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonbAnnotation
public class UserDetail {
	
	private String user_name;
	private String user_spouse;
	
	
	public UserDetail() {
		
	}
	
	
	public UserDetail(String user_name, String user_spouse) {
		super();
		this.user_name = user_name;
		this.user_spouse = user_spouse;
	}


	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_spouse() {
		return user_spouse;
	}
	public void setUser_spouse(String user_spouse) {
		this.user_spouse = user_spouse;
	}


	@Override
	public String toString() {
		return "UserDetail [user_name=" + user_name + ", user_spouse=" + user_spouse + "]";
	}


	
	
}
