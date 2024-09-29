import java.util.*;

public class QuickSort{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the range nof an array: ");

		int n=sc.nextInt();

		sc.nextLine();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the elements into an array: ");

			arr[i]=sc.nextInt();

			}

		quicksort(arr,0,n-1);

		System.out.println("The array elements after quicksort is: "+Arrays.toString(arr));

		}

	public static void quicksort(int[] arr,int low,int high){

		if(low<high){

			int pivot=partition(arr,low,high);

			quicksort(arr,low,pivot-1);

			quicksort(arr,pivot+1,high);

			}

		}

	public static int partition(int[] arr,int low,int high){

		int pivot=arr[high];

		int i=low-1;

		for(int j=low;j<high;j++){

			if(arr[j]<=pivot){

				i++;

				int temp=arr[j];

				arr[j]=arr[i];

				arr[i]=temp;

				}

			}

		int temp=arr[high];

		arr[high]=arr[i+1];

		arr[i+1]=temp;

		return i+1;

		}

}
