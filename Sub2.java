public class Sub2
{
public static void main(String args[])
{
int a[][]={{100,100,100},{40,50,60}};
int b[][]={{50,50,50},{50,20,10}};
int c[][]=new int[3][2];

for(int i=0;i<=a.length;i++)
{
for(int j=0;j<b.length;j++)
{
	c[i][j]=a[i][j]-b[i][j];
System.out.print(c[i][j]+"");
}
System.out.println();
}
}
}