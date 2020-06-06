import java.util.Scanner;
public class Primenumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,c=0,j,n;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the first number");
		n = sc1.nextInt();
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				
				if(i%j == 0) {
					c++;
				}
				
			}
		}
		
		if( c == 2) {
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
		

	}

}
