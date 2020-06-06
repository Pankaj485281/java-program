import java.util.Scanner;

public class CharacterAlphabet{
	public static void main(String args[]){
		char a;
		Scanner sc = new Scanner(System.in); 
		a= sc.next().charAt(0);
		if(97>=0 && 122<=123)
		{
			System.out.println("this is smaller character");
			System.out.println((int)a);
		} 
		else if(65>=0 && 90<=91)
		{
			System.out.println("this is largest character");
			System.out.println((int)a);

		}
		else{
			System.out.print("enter character");
		}
	}
}