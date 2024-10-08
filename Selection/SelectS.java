import java.util.*;

public class SelectS{

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

		for(int i=0;i<n;i++){

			int minindex=i;

			for(int j=i+1;j<n;j++){

				if(arr[j]<arr[minindex]){

					minindex=j;

						}

					}

		int minvalue=arr[minindex];

		for(int k=minindex;k>i;k--){

				arr[k]=arr[k-1];

					}
		arr[i]=minvalue;


				}

		System.out.println("The array after Sorted will be: "+Arrays.toString(arr));


			}

}
