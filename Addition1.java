public class Addition1
{
public static void main(String args[])
{
int a[][]={{10,20,30},{40,50,60}};
int b[][]={{10,20,40},{50,20,10}};
int c[][]=new int[3][2];

for(int i=0;i<=a.length;i++)
{
for(int j=0;j<b.length;j++)
{
	c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]+" ");
}
System.out.println();
}
}
}