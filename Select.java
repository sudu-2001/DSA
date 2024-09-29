import java.util.*;

public class Select{

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

		System.out.println("The array befor sorting is: "+Arrays.toString(arr));


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

	System.out.println("The array after sorting is: "+Arrays.toString(arr));

		}

}
