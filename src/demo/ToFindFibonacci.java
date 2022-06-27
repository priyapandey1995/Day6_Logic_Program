package demo;

import java.util.Scanner;

public class ToFindFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			 
			System.out.println("Enter the number of elements");
			int number=sc.nextInt();
			
			//inistialisation
			int second=1,sum=0,next;
			
			//loop untiul the number is less than or equal to first
			for(int first=0;first<=number;) {
				System.out.println(first);
				sum=sum+first;//adding sum
				next=first+second;//adding the first and second number to next
				first=second;
				second=next;
			}
			System.out.println("the sum is"+sum);
	}

}
