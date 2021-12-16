package com.async;

public class RunnableDemo {
    public static void main(String n[]) {
    	Runnable r=new Runnable() {
    		 public void run() {
    			 System.out.println(Thread.currentThread().getName()+" "
    			 		+ " Thread is running and Runnning...!!!");
    		 }
    	};
    	
    	Runnable r2=()->{
    		 System.out.println(Thread.currentThread().getName()+" "
 			 		+ " Thread lambda based is running and Runnning...!!!");
    	};
    	
    	Thread t=new Thread(r,"Thread1");
    	Thread t2=new Thread(r,"thread2");
    	Thread t3=new Thread(r2,"thread3");
    	t.start();
    	t2.start();
    	t3.start();
    	System.out.println("Main Program");
    	
    	
    }
    
}
