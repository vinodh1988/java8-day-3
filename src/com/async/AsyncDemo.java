package com.async;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncDemo {

	public static void main(String n[]) {
		ExecutorService e=Executors.newSingleThreadExecutor();
		
		System.out.println("Process started ..as of now it is synchronous");
		System.out.println("Still synchronous");
		System.out.println("Next few lines deals with resource decided to run it asynchrounously");
		
		e.execute(()->{
			System.out.println("Connecting with resouce ,might take time");
				try{
					Thread.sleep(3000);
					System.out.println("Processed the resource Done with the task");
				}
				catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		);
          
		System.out.println("This lines are not concerned about thing that happening in 15 to 26");
	}
}
