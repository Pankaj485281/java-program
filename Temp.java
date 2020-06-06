import java.util.*;

public class Temp
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		double c,f;
		System.out.print("enter second number");
		f= sc.nextDouble();
		c = (5*f-106)/9;
		System.out.print("temp ="+c);
	}
}