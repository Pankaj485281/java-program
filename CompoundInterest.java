import java.util.*;
import java.lang.*;
public class CompoundInterest
{
	public static void main(String srgs[])
	{
		Scanner sc = new Scanner(System.in);
		double a,p,r,n;
		System.out.print("enter first number");
		p = sc.nextDouble();
		System.out.print("enter second number");
		r = sc.nextDouble();
		System.out.print("enter third number");
		n = sc.nextDouble();
		a = p*Math.pow((1+(r/100)),n)-p;
		System.out.print("Compound Interest is  ="+a);
	}
}