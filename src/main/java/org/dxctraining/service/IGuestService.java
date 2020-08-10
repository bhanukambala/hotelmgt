package org.dxctraining.service;

import java.util.List;

import org.dxctraining.entities.Guest;

public interface IGuestService {
	 List<Guest> findAllGuests();
		Guest findById(String id);
		void register(Guest guest);
		Guest updateGuestInfo(Guest guest);
}
