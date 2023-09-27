package Encapsulation;

public class Student {
  
	
	private String name;
	private String section;
	private int rollNumber;
	private int standard;
	
	public void acceptData(String name,String section,int rollNumber,int standard)
	{
		this.name= name;
		this.section= section;
		this.rollNumber = rollNumber;
		this.standard = standard;
	}
	public void showData() {
		System.out.println("student name is : "+name );
		System.out.println("student section is : "+section );
		System.out.println("student rollNumber is : "+rollNumber );
		System.out.println("student standard is : "+standard );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


