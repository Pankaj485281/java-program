public class Swap
{
	public static void main(String args[])
	{
		int a=20,b=40;
		a+=b;
		b=a-b;
		a-=b;
		System.out.println("a="+a+"b="+b);
	}
}