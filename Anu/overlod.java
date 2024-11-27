class addition
{
	 int add(int a,int b)
	{
		return a+b;
		}
		 int add(int a,int b,int c)
	{
		return a+b+c;
		}
}
class overlod
{
	public static void main(String args[])
	{
	addition a1=new addition();
		System.out.println(a1.add(12,14));
		System.out.println(a1.add(12,14,16));
	}
}