import java.util.Scanner;

public class Find_key {

	public static void main(String[] args) {

		int[] arr = new int[5];
		boolean flag=false;
		System.out.println("Enter the elements in an array");

		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i] = sc.nextInt();
		}

		for (int number : arr) {
			System.out.print(" " + number);

		}
		
		System.out.println("Enter the element for search");
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				
				flag=true;
				System.out.println("Key found");
			}
			else
			{
				System.out.println("Key not found");
			
			}
		}
	
		

	}

}
