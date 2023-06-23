public class Area
{
static double area(double r)
{

double m=(3.14*r*r);
return m;
}
static int area(int a)
{
int n=(a*a);
return n;
}
static int area(int l,int b,int h)
{
int o=(l*b*h);
return o;
}
public static void main(String args[])
{
double x=Area.area(3.1);
System.out.println(x);
int y=Area.area(5);
System.out.println(y);
int z=Area.area(2,4,3);
System.out.println(z);
}
}