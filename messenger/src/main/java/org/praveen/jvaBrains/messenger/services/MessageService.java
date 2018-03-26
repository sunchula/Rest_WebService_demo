package org.praveen.jvaBrains.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.praveen.jvaBrains.messenger.dataBase.DatabaseClass;
import org.praveen.jvaBrains.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1,"Hello World!!","Praveen"));
		messages.put(2L, new Message(2,"Hello Jersey!!","Archana"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());	
	}
	
	public Message getMessage(Long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId()<=0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(Long id) {
		return messages.remove(id);
	}
	
	
	/*public List<Message> getAllMessages(){	
		
		Message m1 = new Message(1L,"Hello World!!","Praveen");
		Message m2 = new Message(2L,"Hello Jersey!!","Archana");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}*/
	
	
}
