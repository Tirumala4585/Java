package com.programs;
interface Drawable
{
	void draw();
	static void cube(int x)
	{
		System.out.println("Cube Value:"+(x*x*x));
	}
	
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Rectangle is drawn");
	}
}
public class InterfaceDemo {
	
	public static void main(String []args)
	{
		Drawable r = new Rectangle();
		r.draw();
		Drawable.cube(10);
	}
	
	

}
