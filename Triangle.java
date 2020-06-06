import java.util.*;

public class Triangle
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		double h,b,area;
		System.out.print("enter a height");
		h= sc.nextInt();
		System.out.print("enter a base");
		b= sc.nextInt();
		area = (h*b)/2;
		System.out.print("Area of triangle ="+area);
	}
}