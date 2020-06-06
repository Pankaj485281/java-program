import java.util.*;

public class TrianglePerimeter
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		int perimeter,a;
		System.out.print("enter a number");
		a= sc.nextInt();
		perimeter = 3*a;
		System.out.print("perimeter of triangle ="+perimeter);
	}
}