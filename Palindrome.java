public class Palindrome
{
public static void main(String args[])
{
int n=123,rem,sum=0,temp;
temp=n;
while(n>0)
{
rem=n%10;
sum=(sum*10)+rem;
n=n/10;
}
if(temp==sum)
{
System.out.println("Palindrome number");
}
else
{
System.out.println("Not palindrome ");
}
}
}