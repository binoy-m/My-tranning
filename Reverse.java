public class Reverse
{
public static void main(String args[])
{
int num=123,rev=0,d;
while(num!=0)
{
d=num%10;
rev=rev*10+d;
num/=10;
}
System.out.println("Reverse of the number"+rev);
}
}