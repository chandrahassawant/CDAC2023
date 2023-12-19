import java.util.Scanner;

public class Createdisplaynames {

	public static void main(String[] args) {
		
		int size =0;
		System.out.println("Enter the size for array");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		sc.nextLine();
		String [] arr = new String[size];
		
		System.out.println("Enter the elemets for array");
		
		for (int i =0; i<size;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		
	
		
		System.out.println("--------- Display-----------");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}


	}

