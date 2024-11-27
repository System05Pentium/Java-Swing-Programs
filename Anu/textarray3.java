class textarray3
{
public static void main(String args[])
{
int a[]={30,24,56,67,88};
int search=55


,i;
for(i=0;i<a.length;i++)
if(search==a[i])
{
	break;
}
if(i==a.length)
{
	System.out.println("element was not found");
}
else
{
	System.out.println("element was found");
}
}
}
