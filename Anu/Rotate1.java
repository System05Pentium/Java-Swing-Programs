class Rotate1
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,6,7,8,9,10};

System.out.println("Orginal array:");
for(int i=0;i<a.length;i++)
{
	System.out.print( a[i]+" ");
}
System.out.println();
leftRotate(a);
System.out.println("Rotate array:");
for(int i=0;i<a.length;i++)
{
	System.out.print( a[i]+" ");
}
}

public static void leftRotate(int array[])
{
	
	int temp=array[0];
	for(int j=0;j<array.length-1;j++)
	{
		array[j]=array[j+1];
		}	
		array[array.length-1]=temp;

}
}