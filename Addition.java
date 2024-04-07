class Addition
{
   public int add(int a, int b)
   {
       return a+b;
   }
   public int add(int a, int b, int c)
   {
      return a+b+c;
   }
   public static void main(String []args)
   {
      MethodOverloading m = new MethodOverloading();
      System.out.println("Addition = "+m.add(10,20));
      System.out.println("Addition = "+m.add(10,20,30));
   }
}

     
     
   