import java.util.*;

public class bubblepractice{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the range of an array: ");

		int n=sc.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the elements into an array at position " + (i+1));

			arr[i]=sc.nextInt();

			}

		for(int i=0;i<n-1;i++){

			for(int j=0;j<n-i-1;j++){

				if(arr[j]>arr[j+1]){

					int temp=arr[j];

					arr[j]=arr[j+1];

					arr[j+1]=temp;

					}

				}

			}

		System.out.println("The array elemets after bubble sort will be: " + Arrays.toString(arr));

		}

}
