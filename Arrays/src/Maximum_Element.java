import java.util.Scanner;

public class Maximum_Element {

	public static void main(String[] args) {

		int[] arr = new int[5];
		int greater = 0;

		System.out.println("Enter the elements in an array");

		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
		}

		for (int number : arr) {
			System.out.print(number);
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > greater) {
				greater = arr[i];
			}

		}
		System.out.println();
		System.out.println("Greater number is "+greater);
		
	}

}
