import java.util.*;

public class FibRecur{

	static int count=2;

	public static void fibbonacci(int prev1,int prev2){

		if(count<=50){

			int sumfib=prev1+prev2;

			prev2=prev1;

			prev1=sumfib;

			System.out.println("The Fibbonacci Series "+ (count+1) +" is : " +sumfib);

			sleep(1000);

			count +=1;

			fibbonacci(prev1,prev2);

			}

		else{

			return;

			}

		}

	public static void main(String[] args){

		System.out.println("The fibbonacci series of 1st element is: "+0);

		System.out.println("The fibbonacci series of 2and element is: "+1);

		fibbonacci(1,0);

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
