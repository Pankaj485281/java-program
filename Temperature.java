import java.util.*;

public class Temperature
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		double c,f;
		System.out.print("enter second number");
		c= sc.nextDouble();
		f = (9*c+160)/5;
		System.out.print("temp ="+f);
	}
}