package demo;

import java.util.Scanner;

public class GenerateCoupenNumber {
	
	public static void main(String[] args) {

	System.out.println("Enter five numbers of 3 digits");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	int num4= sc.nextInt();
	int num5= sc.nextInt();
	
	int toGetCoupen=1;
	while (toGetCoupen<999999)	{
		
	toGetCoupen = 100 + (int)(Math.random() * 999);
	
	
	if (toGetCoupen==num1) {
		System.out.println("matched " +num1);
		break;
	}
	else if (toGetCoupen==num2) {
		System.out.println("matched " +num2);
		break;
	}
	else if (toGetCoupen==num3) {
		System.out.println("matched " +num3);
		break;
	}
	else if (toGetCoupen==num4) {
		System.out.println("matched " +num4);
		break;
	}
	else if (toGetCoupen==num5) {
		System.out.println("matched " +num5);
		break;
	}
	}
}

}
		
	


