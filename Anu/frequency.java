class Frequency
{
public static void main(String args[])
{
int a[]={3,6,2,4,5,6,6,7,9,8};
int searchNumber=6;

int frequency=findFrequency(a,searchNumber);
System.out.println("Array:");
printArray(a);
System.out.println("Frequency of"  +searchNumber + ":" +frequency);
}
public static int findFrequency(int array[],int searchNumber)
{
int frequency=0;
for(int i:array)	
{
	if(i==searchNumber)
	{
		frequency++;
	}
}
return frequency;
}
public static void printArray(int array[])
{
	for(int i:array)
	{
		System.out.println(i+"");
	}
}
		}
		