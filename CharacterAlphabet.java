import java.util.Scanner;

public class CharacterAlphabet{
	public static void main(String args[]){
		char a;
		Scanner sc = new Scanner(System.in); 
		a= sc.next().charAt(0);
		if(97<=a && 122>=a)
		{
			System.out.println("this is smaller character");
			System.out.println((int)a);
		} 
		else if(a>=65 && a<=90)
		{System.out.println("this is largest character");
			System.out.println((int)a);
		}
		
		else{
			System.out.print("enter character");
		}
	}
}