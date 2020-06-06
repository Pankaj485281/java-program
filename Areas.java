import java.util.Scanner;
class Areas
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		ch = sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("this is uper case");
		}
		else
		{
			System.out.println("this is lower case");
		}
		switch(ch)
		{
			case 'A':
			break;
			case 'a':
			break;
			default:
				System.out.println("hiiii");
			
			
		}

	}
}