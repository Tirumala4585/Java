package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int rollno;
	private String name;
	private String email;
	public Employee(int rollno,String name,String email) {
		this.rollno=rollno;
		this.name=name;
		this.email=email;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public static void main(String []args) {
		Employee e1 = new Employee(1,"Ramesh","ramesh@gmail.com");
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		for(Employee em:list) {
			System.out.println("RollNo:"+em.getRollno()+",Name:"+em.getName()+",Email:"+em.getEmail());
		}
		
	}

}
