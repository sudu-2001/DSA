import java.util.*;

public class Insert{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the size of an array: ");

	int n=sc.nextInt();

	sc.nextLine();

	int[] arr=new int[n];

	for(int i=0;i<n;i++){

		System.out.println("Enter the elements into an array: ");

		arr[i]=sc.nextInt();

		}

	System.out.println("Array befor sorting is: "+Arrays.toString(arr));

	for(int i=1;i<n;i++){

		int temp=arr[i];

		int j=i-1;

		while(j>=0 && arr[j]>temp){

			arr[j+1]=arr[j];

			j--;

			}

		arr[j+1]=temp;

		}

	System.out.println("The array after insertion sort is: "+Arrays.toString(arr));


	}

}
