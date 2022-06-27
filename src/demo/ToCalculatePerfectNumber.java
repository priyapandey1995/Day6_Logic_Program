package demo;

import java.util.Scanner;

public class ToCalculatePerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int sum=0,num,rem;
		
		// to check the perfect number
		System.out.println("Enter the number");
		num=sc.nextInt();
		
			//divide the number
		
		
		//run loop till i is less than num
		for(int i=1;i<num;i++) {
			if(num%i==0) {//if the num is equal to 0,
				sum=sum+i;//sum will get incremented
			}
		}
			if(sum == num )//if sum == num
			System.out.println(num + " is perfect number");
			else
			System.out.println(num + "is not a perfect number");
			
		}
	}


