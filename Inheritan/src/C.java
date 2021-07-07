/*A Java program to perform Inheritance*/
class A 
{
	   int c;
	   public void getvalue(int a,int b) 
	   {
	      System.out.println("The values of a and b:"+a+" "+b);
	   }
	   public void add(int a, int b) 
	   {
		   c = a + b;
	   }
	   public void print()
	   {
		   System.out.println("Addition:"+c);
	   }
}
class B extends A 
{
	public void getvalue(int a,int b) 
	{
		System.out.println("The values of a and b:"+a+" "+b);
	}
	public void sub(int a, int b) 
	{
		c = a-b;
	}
	public void print()
	{
		System.out.println("Subtraction:"+c);
	}
}
class C extends B
{
	public void getvalue(int a,int b) 
	{
		System.out.println("The values of a and b:"+a+" "+b);
	}
	public void mul(int a, int b) 
	{
		   c = a * b;
	}
	public void print()
	{
		System.out.println("Multiplication:"+c);
	}
public static void main(String args[]) 
{
	C ob3 = new C();
	int a=10,b=20;
	A ob1=new A();
	ob1.getvalue(a, b);
	ob1.add(a,b);
	ob1.print();
	B ob2=new B();
	ob2.getvalue(a, b);
	ob2.sub(a,b);
	ob2.print();
    ob3.getvalue(a,b);
    ob3.mul(a,b);
    ob3.print();
}
}