package org.dxctraining.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.dxctraining.dao.*;
import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.InvalidArgumentException;

@Service
public class GuestServiceImpl implements IGuestService{
	@Autowired
	private IGuestDao dao=new GuestDaoImpl();

	@Override
	public List<Guest> findAllGuests() {
		List<Guest> list=dao.findAllGuests();
		return list;
	}

	@Override
	public Guest findById(String id) {
		checkId(id);
		Guest guest=dao.findById(id);
		return guest;
		
	}

	public void checkId(String id) {
		if(id==null) {
			throw new InvalidArgumentException("id can't be null or empty");
		}
	}
		public void checkGuest(Guest guest) {
			if(guest==null) {
				throw new InvalidArgumentException("guest can't be null or empty");
		}
	}

	@Override
	public void register(Guest guest) {
		checkGuest(guest);
		dao.register(guest);
		
	}

	@Override
	public Guest updateGuestInfo(Guest guest) {
		checkGuest(guest);
		guest=dao.updateGuestInfo(guest);
		return guest;
	}
	
}
