package week03;

public class Employee {
	private String name;
	private int number;
	private int age;
	
	
	public String toString(){
		return "Name: " + name + "\n" + "Number: " + number + "\n" + "Age: " + age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
}
