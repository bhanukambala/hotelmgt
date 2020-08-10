


/**
 * 
 * what can we do with this keyword
 * 1) we can address members(fields+ methods) of the same object
 *  2) with this we can call constructor of object of same class
 *  
 *  
 */
public class Student{
	private String name;//default to null
	private int age;//default to 0 
	private boolean placed;//default to false
	
	private Course course;
		
	
	/**
	 * constructor is executed immediately after object creation 
	 * constructor is only executed once after object creation 
	 * constructor never returns any thing so it has no return type
	 */	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	//Student s= new Student("praneeth",21,true);
	public Student(String name, int age, boolean placed){
		this(name, age);
		this.placed=placed;
	}
	
	/**
	 * constructor overloading, compiler will now he difference in constructor from 
	 * 1)number of args
	 * 2) type of args
	 * 
	 * zero arg constructor is available to you be default if you have not defined any other constructor
	 * 
	 */		
    public Student(){
		this("",0,false);
	}
	
	
   public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}	
	
	public boolean getPlaced() {
		return placed;
	}	
	
	public void setPlaced(boolean placed) {
		this.placed=placed;
	}
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		String str=name+" "+ age+" "+placed;
		return str;
	}
	
		
	
		
}