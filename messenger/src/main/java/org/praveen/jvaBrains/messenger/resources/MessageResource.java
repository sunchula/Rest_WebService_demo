package org.praveen.jvaBrains.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.praveen.jvaBrains.messenger.model.Message;
import org.praveen.jvaBrains.messenger.services.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService messageService = new MessageService();
	
	//rest API to get all messages
	@GET
	public List<Message> getMessage() {
		return messageService.getAllMessages();
	}
	
	//rest API to get all single message
	@GET
	@Path("/{messageID}")
	public Message getMessage(@PathParam("messageID") long id) {
		return messageService.getMessage(id);
	}
	
	@POST
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageID}")
	public Message updateMessage(@PathParam("messageID") long id, Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageID}")
	public void deleteMessage(@PathParam("messageID") long id) {
		 messageService.removeMessage(id);
	}
}
	