import java.util.*;

public class Insertpractice{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter range of array: ");

		int n=sc.nextInt();

		sc.nextLine();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the atrray elements: "+(i+1));

			arr[i]=sc.nextInt();

			}

		for(int i=1;i<n;i++){

			int temp=arr[i];

			int j=i-1;

			while(j>=0 && arr[j]>temp){

				arr[j+1]=arr[j];

				j--;

				}

			arr[j+1]=temp;

			}

		System.out.println("The array Elements after Insertion sort will Be:" +Arrays.toString(arr));


	}

}
