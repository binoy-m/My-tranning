public class Amstrong
{
public static void main(String args[])
{
int n=153,p=0,rem;
int temp=n;
while(n>0)
{
rem=n%10;
p=p+(rem*rem*rem);
n=n/10;
}
if(temp==p)
{
System.out.println("Amstrong number"+p);
}
else
{
System.out.println("Notamstrong number"+p);
}
}
}
