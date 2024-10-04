import java.util.*;

public class selectpractice{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the range of an array: ");

		int n=sc.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter the elementrs of an array "+ (i+1));

			arr[i]=sc.nextInt();

			}

		for(int i=0;i<n-1;i++){

			int minindex=i;

			for(int j=i+1;j<n;j++){

				if(arr[j]<arr[minindex]){

					minindex=j;

					}

				}

			int minvalu=arr[minindex];

			for(int k=minindex;k>i;k--){

				arr[k]=arr[k-1];

				}

			arr[i]=minvalu;	

			}

		System.out.println("the array elements after the selection sort will be: "+Arrays.toString(arr));


		}

}
