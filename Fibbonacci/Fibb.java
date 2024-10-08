import java.util.*;

public class Fibb{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the rane to perform the fibbonacci: ");

		int range=sc.nextInt();

		sc.nextLine();

		int prev1=1;

		int prev2=0;

		for(int i=0;i<range;i++){

			int sumfibb=prev1+prev2;

			prev2=prev1;

			prev1=sumfibb;

			System.out.println("The result of fibbonacci series number "+ (i+1) +" is: "+ sumfibb);

			sleep(1000);

				}


			}

	public static void sleep(int milisecond){

			try{

			Thread.sleep(milisecond);

				}

			catch(InterruptedException e){

				Thread.currentThread().interrupt();

				System.out.println("Programme is interrupting....");

					}

				}

}
