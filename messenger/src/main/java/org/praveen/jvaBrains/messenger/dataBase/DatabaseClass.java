package org.praveen.jvaBrains.messenger.dataBase;

import java.util.HashMap;
import java.util.Map;

import org.praveen.jvaBrains.messenger.model.Message;
import org.praveen.jvaBrains.messenger.model.Profile;

public class DatabaseClass {

	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	private static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
