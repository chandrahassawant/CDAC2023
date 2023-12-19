import java.util.Scanner;

public class Search_Element_In_Array {

	public static void main(String[] args) {

		int key, size;

		System.out.println("Enter the size for an array!!");
		Scanner sc = new Scanner(System.in);

		size = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[size];

		System.out.println("Enter the elemets");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("--------- Display---------");

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter the element you search!!");
		key = sc.nextInt();
		sc.nextLine();

		boolean found = false;
		for (int i = 0; i <= size; i++) {
			if (arr[i] == key) {
				System.out.println("Key Found!!!!");
				found = true;
				break;

			}
			else
			System.out.println("Not Found!!");
			break;
		}

		
			}
		}
	


