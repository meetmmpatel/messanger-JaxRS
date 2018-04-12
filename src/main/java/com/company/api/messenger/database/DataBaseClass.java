package com.company.api.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.company.api.messenger.model.Message;
import com.company.api.messenger.model.Profile;

public class DataBaseClass {
	
	private static Map<Long, Message> message = new HashMap<>();
	
	
	public static Map<Long,Message> getMessage(){
		return message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static Map<String, Profile> profile = new HashMap<>();
	
	public static Map<String, Profile> getProfiles(){
		return profile;
	}
	

}
