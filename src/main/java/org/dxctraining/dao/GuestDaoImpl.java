package org.dxctraining.dao;

import java.util.*;

import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.GuestNotFoundException;

	public class GuestDaoImpl implements IGuestDao {
		private Map<String,Guest> store=new HashMap<>();
		private int generateid;
		private String generateid() {
			generateid++;
			String idstr=String.valueOf(generateid);
			return idstr;
		}
		@Override
		public List<Guest> findAllGuests() {
			Collection<Guest> values=store.values();
			List<Guest> list=new ArrayList<>();
			for(Guest value:values) {
				list.add(value);
			}
			return list;
		}
		@Override
		public Guest findById(String id) {
			Guest guest=store.get(id);
			if(guest==null) {
				throw new GuestNotFoundException("guest not found for id");
			}
			return guest;
		}
		@Override
		public void register(Guest guest) {
			String id=guest.getId();
			String name=guest.getName();
			store.put(id, guest);
			guest.setId(id);
			
		}
		@Override
		public Guest updateGuestInfo(Guest guest) {
			String id=guest.getId();
			return guest;
			
		}
		
}
