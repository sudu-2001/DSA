import java.util.*;


public class binary{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the range of an array: ");

		int n=sc.nextInt();

		int[] arr=new int[n];

		for(int i=0;i<n;i++){

			System.out.println("Enter array elements are: ");

			arr[i]=sc.nextInt();

		}

		System.out.println("The array elemenst are: "+Arrays.toString(arr));

		System.out.println("Enter the targert value to find out: ");

		int target=sc.nextInt();

		int result=binarysearch(arr,target);

		if(result!=-1){

			System.out.println("The array element "+target+" is found at the index: "+result);

		}

		else{

			System.out.println("The target elemenst is not found.");

		}

	}

	public static int binarysearch(int[] arr,int target){

		int left=0;

		int right=arr.length-1;

		while(left<=right){

			int mid=left+(right-left)/2;

			if(arr[mid]==target){

				return mid;

			}

			if(arr[mid]<target){

				left=mid+1;

			}

			else{

				right=mid-1;

			}

		}

		return -1;

	}

}
