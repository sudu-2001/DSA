import java.util.*;

public class bubble{

	public static void main(String[] args){

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the size of an array: ");

	int n=sc.nextInt();

	sc.nextLine();

	int[] arr=new int[n];

	for(int i=0;i<n;i++){

		System.out.println("Enter Element into an array: ");

		arr[i]=sc.nextInt();

		sc.nextLine();

		}

	System.out.println("The elements of an array after sorting: "+Arrays.toString(arr));

	for(int i=0;i<n-1;i++){

        boolean swapped=false;

	for(int j=0;j<n-i-1;j++){

		if(arr[j]>arr[j+1]){

			int temp=arr[j];

			arr[j]=arr[j+1];

			arr[j+1]=temp;

			swapped=true;

				}

			}

                if(!swapped){ 

                        break;

                                }


		}



	System.out.println("The elements after Sorting are: "+Arrays.toString(arr));

	}

}
