abstract class Number
{
    int no;  
    public Number(int no)
    {
          this.no=no;
    }
    public abstract void Calculate(); 
}
class Square extends Number
{
   public Square(int no)
   {
       super(no);
   }
   public void Calculate()
   {
      System.out.println("Sqaure = "+(no*no));  
   }
}
class Cube extends Number
{
   public Cube(int no)
   {
        super(no);
   }
   public void Calculate()
   {
       System.out.println("Cube = "+(no*no*no));
   }
}
class Demo
{
    public static void main(String []args)
    {
       Number n = new Square(10);
       n.Calculate();
       n = new Cube(20);
       n.Calculate();
    }
}          
