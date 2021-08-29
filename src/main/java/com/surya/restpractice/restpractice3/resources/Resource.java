package com.surya.restpractice.restpractice3.resources;

import java.util.ArrayList;
import java.util.List;

import com.surya.restpractice.restpractice3.model.Message;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class Resource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/name/{name}")
	public String getMessage(@PathParam("name")String inputName) {
		return "Hello " + inputName.toUpperCase();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/list")
	public List<Message> getMessageList() {
		Message message1 = new Message(10L, "hello");
		Message message2 = new Message(20L, "how are you");
		
		List<Message> list = new ArrayList<>();
		list.add(message1);
		list.add(message2);
		
		return list;
	}
}
