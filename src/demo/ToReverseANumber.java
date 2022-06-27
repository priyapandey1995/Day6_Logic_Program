package demo;

import java.util.Scanner;

public class ToReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		 num=sc.nextInt();
		
		 //run the loop until the number equals 0
		while(num!=0) {
			rem=num%10;//get the remiander by dividing the number
			rev=rev*10+rem;//add the rem with the rev
			num=num/10;//again divide the num
			}
		System.out.println("reverse of given number is :" +rev);
		
	}

}
