public class Print
{
static String name;
static int age;
static void set()
{
name="misha";
age=10;
}
static void get()
{
System.out.println(name);
System.out.println(age);
}
public void display()
{
	
}
public static void main(String args[])
{
	Print ob=new Print();
	ob.display();
Print.set();
Print.get();

}
}