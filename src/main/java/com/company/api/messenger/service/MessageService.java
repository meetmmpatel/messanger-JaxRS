package com.company.api.messenger.service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.company.api.messenger.database.DataBaseClass;
import com.company.api.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DataBaseClass.getMessage();

	// Just for hard coded for get message purpose
	public MessageService() {
		messages.put(1L, new Message(1L, "GET TEST", new Date(04, 19, 2018), "Max"));
		messages.put(2L, new Message(2L, "GET TEST 2", new Date(04, 20, 2010), "Peter"));

	}

	public List<Message> getAll() {
		return new ArrayList<Message>(messages.values());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Message getMessage(long id) {
		return messages.get(id);

	}

	public Message addMessage(Message message) {

		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);

		return message;

	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
