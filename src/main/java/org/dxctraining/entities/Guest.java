package org.dxctraining.entities;



public class Guest {
	private String id;
	private String name;
	
	public Guest(String id,String name) {
		this.id=id;
		this.name=name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		int hash=id.hashCode();
		return hash;
	}
	@Override
	public boolean equals(Object arg) {
		if(arg==this) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Guest) ) {
			return false;
	   }
		
	    Guest that=(Guest)arg;	
		boolean equalResult=this.id.equals(that.id);
		return equalResult;
	}

}
