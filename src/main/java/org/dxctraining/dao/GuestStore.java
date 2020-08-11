package org.dxctraining.dao;

import java.util.*;

import org.dxctraining.entities.Guest;

public class GuestStore {
	private static Map<String,Guest> store=new HashMap<>();
	public static Map<String,Guest> getStore(){
		return store;
	}

}
