import java.util.*;

public class Rectangle
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		int l,w,area;
		System.out.print("enter a lenght");
		l= sc.nextInt();
		System.out.print("enter a width");
		w= sc.nextInt();
		area = l*w;
		System.out.print("Area of Rectangle ="+area);
	}
}