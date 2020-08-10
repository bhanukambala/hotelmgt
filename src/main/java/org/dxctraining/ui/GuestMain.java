package org.dxctraining.ui;
import java.util.*;

import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.*;
import org.dxctraining.service.*;

public class GuestMain {
	private IGuestService service=new GuestServiceImpl();
	public static void main(String[] args) {
		GuestMain demo=new GuestMain();
		demo.runUi();
	}
	public void runUi() {
		try {
			Guest guest1=new Guest("mk1","mallika");
			Guest guest2=new Guest("bk1","bhanu");
			Guest guest3=new Guest("hp1","hema");
			service.register(guest1);
			service.register(guest2);
			service.register(guest3);
			displayAllGuests();
		}
		 catch (InvalidArgumentException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

			catch (GuestNotFoundException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

			catch (Exception e) {
				e.printStackTrace();
				System.out.println("some thing went wrong");
			}


	}
	private void displayAllGuests() {
		List<Guest> list=service.findAllGuests();
		for(Guest guest:list) {
			display(guest);
		}
		
		
	}
	private void display(Guest guest) {
		System.out.println(""+guest.getId()+""+guest.getName());		
	}
}
