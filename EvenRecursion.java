
public class EvenRecursion {
	public static void printEven(int num) 
	{
		if(num>100)
		{	
			return;
		}
		System.out.println(num);
		printEven(num+2);
	}
	public static void main(String []args) {
		System.out.println("Even Numbers from 1 to 100");
		printEven(2);
	}

}
