import java.util.*;

public class SquarePerimeter
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		int a,perimeter;
		System.out.print("enter a number");
		a= sc.nextInt();
		perimeter = 4*a;
		System.out.print("perimeter of square ="+perimeter);
	}
}