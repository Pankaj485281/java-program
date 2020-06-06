import java.util.Scanner;

public class Age{
	public static void main(String args[])
	{
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first Age");
		a= sc.nextInt();
		System.out.println("enter the second Age");
		b= sc.nextInt();
		System.out.println("enter the third Age");
		c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("oldest Age is="+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("oldest age"+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("oldest age ="+c);

		}
		else
		{
			System.out.println("all are equal");
		}
	}
}