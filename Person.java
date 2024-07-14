package Task11;

/*
 * Q1:Create a class called "person" with attributes "name" and "age".
 * Also create a constructor and getter methods for the attributes
  */
public class Person {

	//Attributes 
	String name;
	int age;
	
	//Parameterized constructor
	public Person(String name,int age) { 
		this.age=age;
		this.name=name;
	}
	
	//getter method
	public String method1() {
		return name;
	}
	
	public int method2() {
		return age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor calling
		Person p1= new Person("John",60);
		
		//getter method calling
		System.out.println("Name:"+p1.method1());
		System.out.println("Age:"+p1.method2());
	}
}
