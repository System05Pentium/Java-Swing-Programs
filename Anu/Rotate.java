class Rotate
{
public static void main(String args[])
{
int a[]={1,2,3,4,5,6,7,8,9,10};
int position=1;
System.out.println("Orginal array:");
printArray(a);
leftRotate(a,position);
System.out.println("Rotate array:");
printArray(a);
}
public static void leftRotate(int array[],int position)
{
	
	int temp=array[0];
	for(int j=0;j<array.length-1;j++)
	{
		array[j]=array[j+1];
		}	
		array[array.length-1]=temp;
}

public static void printArray(int array[])
{
	
for(int i=0;i<array.length;i++)
{
	System.out.print( array[i]+" ");
}
System.out.println();
}
}