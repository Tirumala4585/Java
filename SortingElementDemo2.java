import java.util.*;
class Person implements Comparable<Person>

{
	String name;
	int age;
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Person other) {
		return Integer.compare(this.age,other.age);
	}
}
public class SortingElementDemo2 {
	public static void main(String []args)
	{
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Ganesh",1000));
		people.add(new Person("Sharma",30));
		people.add(new Person("Raju",40));
		Collections.sort(people);	
		for(Person p:people) {
			System.out.println("Name : "+p.name+"\n"+"Age : "+p.age);
		}
	}
	

}
