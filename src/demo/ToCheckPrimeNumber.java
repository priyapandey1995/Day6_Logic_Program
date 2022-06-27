package demo;

import java.util.Scanner;

public class ToCheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//initialisation
		int num,temp=0;
		
		System.out.println("Enter the number");
		num=sc.nextInt();// input from user
		
		//loop until the num-1 
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {    //check if the num is equal to 0
				 temp=temp+1;  //if it equal then the temp will get incremented
			}
		}
		if(temp>0) {//if temp is greater than zero 
			System.out.println(num +" "+ "is not prime number");
		}
		else {
			System.out.println(num + " " + "is a prime number");
		}
	}

}
