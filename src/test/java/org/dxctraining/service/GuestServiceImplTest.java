package org.dxctraining.service;

import org.dxctraining.dao.*;
import org.dxctraining.entities.*;
import org.dxctraining.exceptions.*;

import java.util.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;




 class GuestServiceImplTest {
	 GuestServiceImpl service;
	 
	 @BeforeEach
	 void init() {
		 service=new GuestServiceImpl();
	 }
	 
	 @AfterEach
	 public void clear() {
		 Map<String,Guest> store=GuestStore.getStore();
		 store.clear();
	 }
	 @Test
	 public void test_add1(){
		 
		 String id="mk1";
		 String name="mallika";
		 Guest guest=new Guest(id,name);
		 service.register(guest);
		 String storedId=guest.getId();
		 Map<String,Guest> store=GuestStore.getStore();
		 Collection<Guest> values=store.values();
		 int actualSize=values.size();
		 Assertions.assertEquals(1, actualSize);
		 Iterator<Guest> iterator=values.iterator();
		 Guest storedGuest=iterator.next();
		 String actualId=storedGuest.getId();
		 Assertions.assertEquals(storedGuest.getId(),storedId);
		 Assertions.assertEquals(id,actualId);
		 Assertions.assertEquals(name,storedGuest.getName());
		
	 }
	 public void test_add2() {
		 Executable executable=()->service.register(null);	
		 Assertions.assertThrows(InvalidArgumentException.class, executable);	
	 }
	 @Test
	 public void testFindById() {
		 Map<String,Guest> store=GuestStore.getStore();
		 String id="mk1";
		 String name="mallika";
		 Guest guest=new Guest(id,name);
		 guest.setId("mk1");
		 store.put(id,guest);
		 Guest actual=service.findById(id);
		 Assertions.assertNotNull(actual);
		 Assertions.assertEquals(id,actual.getId());
		 Assertions.assertEquals(name,actual.getName());
	 }
	 @Test
	 public void testFindById_2() {
		 String id="bk1";
		 Executable executable=()->service.findById(id);
		 Assertions.assertThrows(GuestNotFoundException.class,executable);
	 }
}
