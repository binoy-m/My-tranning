public class Example4
{
int age;
String name;
static String institute=" obsqura";
public void display()
{
System.out.println(name+""+age);
System.out.println(institute);
}
public static void main(String args[])
{
Example4 ob=Example4(10,"misha");
Example4 ob1=Example4(11,"lech");
Example4 ob2=Example4(12,"meera");
ob.display();
ob1.display();
ob2.display();


}
}