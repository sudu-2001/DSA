import java.util.*;

public class Quick{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the range of an array: ");

		int n=sc.nextInt();

		sc.nextLine();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the elements into an array: ");

			arr[i]=sc.nextInt();

			}

		System.out.println("The array elements befor quick sorting are: "+Arrays.toString(arr));

		quicksort(arr,0,n-1);

		System.out.println("The array elements after quick sorting are:"+Arrays.toString(arr));

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

				int temp=arr[i];

				arr[i]=arr[j];

				arr[j]=temp;

				}

			}

		int temp=arr[high];

		arr[high]=arr[i+1];

		arr[i+1]=temp;

		return i+1;

		}

}
