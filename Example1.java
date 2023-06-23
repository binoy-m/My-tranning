public class Example1
{
static int m=10;//Static variable//
int b=20;// Instance variable//
public static void show()//Static method//
{

	System.out.println("Static Method");
}
public void display()//instance method//
{
int s=60;//local variable//
System.out.println(s);
System.out.println("Instance Method");
}
public static int subtraction(int g,int h)
{
	int sub= g-h;
	return sub;
}
public int add(int x, int y)
{
	int sum=x+y;
return sum;
}
public static void main(String args[])
{
Example1.show();
Example1 ob=new Example1();
ob.display();
System.out.println(m);
System.out.println(ob.b);
System.out.println(ob.add(30,10));
System.out.println(subtraction(100,50));
} 
}