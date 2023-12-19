import java.util.Scanner;
public class Createanddisplay {
	
	public static void main(String[] args) {
		
		int size =0;
		System.out.println("Enter the size for array");
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter the elemets for array");
		
		for (int i =0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println();
		
		System.out.println("--------- Display-----------");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
