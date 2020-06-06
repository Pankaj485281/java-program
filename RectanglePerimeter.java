import java.util.*;

public class RectanglePerimeter
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		int l,w,perimeter;
		System.out.print("enter a lenght");
		l= sc.nextInt();
		System.out.print("enter a width");
		w= sc.nextInt();
		perimeter = 2*(l+w);
		System.out.print("perimeter of rectangle ="+perimeter);
	}
}