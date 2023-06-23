 public class Student
{
int id,mark1,mark2,mark3;
String name;
static int total;

public Student(int no,String n,int m1,int m2,int m3)
{
id=no;
name=n;
mark1=m1;
mark2=m2;
mark3=m3;
}
int total1()
{
 total=mark1+mark2+mark3;
 return total;
}
void grade()
{
if(total>=140)
{
	System.out.println("Grdae A");
}
else
{
	System.out.println("Grade B");

}
}
public static void main(String args[])
{
Student ob=new Student(20,"Dhaksh",50,45,50);
ob.total1();
ob.grade();
Student ob1=new Student(21,"Naksh",50,50,45);
ob.total1();
ob1.grade();
}
}