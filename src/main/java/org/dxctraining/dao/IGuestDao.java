package org.dxctraining.dao;

import java.util.List;

import org.dxctraining.entities.Guest;

public interface IGuestDao {
	 List<Guest> findAllGuests();
	Guest findById(String id);
	void register(Guest guest);
	Guest updateGuestInfo(Guest guest);
	
}
