import java.util.*;

public class PracticeQ2{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of an array: ");

		int n=sc.nextInt();

		sc.nextLine();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the elements into the array "+(i+1));

			arr[i]=sc.nextInt();

			}


		quicksort(arr,0,n-1);

		System.out.println("The array Elements after the Quick sort will be: " + Arrays.toString(arr));

		}

	public static void quicksort(int[] arr,int low,int high){

		if(low<high){

		int piviot=partition(arr,low,high);

		quicksort(arr,low,piviot-1);

		quicksort(arr,piviot+1,high);

		}

	}

	public static int partition(int[] arr,int low,int high){

		int piviot=arr[high];

		int i=low-1;

		for(int j=low;j<high;j++){

		if(arr[j]<=piviot){

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
