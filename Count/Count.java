import java.util.*;

public class Count{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of an array: ");

		int n=sc.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the values into an array at the position: "+(i+1));

			arr[i]=sc.nextInt();

		}

	partition(arr);

	System.out.println("Elements of an array after Count sort will be: "+ Arrays.toString(arr));

	}

	public static void partition(int[] arr){

		int maxval=arr[0];

		for(int num:arr){

			if(num>maxval){

				maxval=num;

			}

		}

		int[] count=new int[maxval+1];

		for(int num:arr){

			count[num]++;

		}

		int index=0;

		for(int i=0;i<=maxval;i++){

			while(count[i]>0){

				arr[index++]=i;

				count[i]--;

			}

		}

	}

}
