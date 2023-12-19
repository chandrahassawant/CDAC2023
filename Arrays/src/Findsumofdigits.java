import java.util.Scanner;

public class Findsumofdigits {

	public static void main(String[] args) {

		
		int digit =0;

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		while(number!=0)
		{
		number =number/10;
		++digit;
		}
		
		System.out.println(digit);
	}

}
