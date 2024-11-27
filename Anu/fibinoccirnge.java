/*class fibinoccirnge
{
public static void main(String args[])
{
int f1=0,f2=1,f3;
do
{
	System.out.println(f1);
f3=f1+f2;
f1=f2tf;
f2=f3;
}while(f1<10);

}
}*/


/*class fibinoccirnge
{
public static void main(String args[])
{
int f1=0,f2=1,f3,n1=10,n2=50;
do
{
int num=f1;
f3=f1+f2;
f1=f2;
f2=f3;
if(num<n1)continue;
System.out.println(num);
}while(f1<=n2);

}
}*/
class fibinoccirnge
{
public static void main(String args[])
{
int f1=0,f2=1,f3,n1=10,n2=50;
do
{

f3=f1+f2;
f1=f2;
f2=f3;
System.out.println(f3);
if(f3>n2)break;
//System.out.println(f3);
}while(true);

}
}