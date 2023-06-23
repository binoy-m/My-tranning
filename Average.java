public class Average
{
static int avg(int a,int b,int c)
{
int avgs=(a+b+c)/3;
return avgs;
}
static float avg(float a,float b,float c)
{
float avgs=(a+b+c)/3;
return avgs;
}
public static void main(String args[])
{
	int m=Average.avg(10,20,30);
System.out.println(m);
float n=Average.avg(10.2f,20.2f,30.4f);
System.out.println(n);

}
}