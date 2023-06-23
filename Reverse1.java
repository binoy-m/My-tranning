public class Reverse1
{
int num,rev=0,res;
Reverse1(int num)
{
	this.num=num;
while(num!=0)
{
rem=num%10;
res=(res*10)+rem;
num=num/10;
}
}
Reverse1()
{
	this(541);

System.out.println(rev);
}
public static void main(String args[])
{
Reverse1 ob=new Reverse1();
}
}
