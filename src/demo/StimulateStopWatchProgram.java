package demo;

import java.util.Date;


public class StimulateStopWatchProgram {

	public static void main(String[] args) {
		
		long elapsed=0;
		
		long startTime = System.nanoTime(); 
		System.out.println("Starting Time is" +" " +startTime);
		
		 
		long stopTime = System.nanoTime();
		System.out.println("Stoping time is" + " " +stopTime);
		
		elapsed=stopTime-startTime;
		System.out.println("elasped time is"+ " " + elapsed/1000 + "seconds");
		
	}

}
