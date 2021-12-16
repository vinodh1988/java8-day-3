package com.circuit;

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoShortCircuit2 {
   public static void main(String[] args) {
	   String names[]= {"Joseph","Arjun","Manish","Jack","Laury","Harry",
				"Rickey","Shravan","Jay","Shaun","Ram","Krishna","Nicholas","Jerry"};
		
	   System.out.println("Result is "+Arrays.stream(names).map(x->{
		   System.out.println(x+" is being processed");
		   return x.toUpperCase();
	   }).allMatch(x->{
		    return x.length()>=3;
	   }));
	   System.out.println("------------------------------------");
	   System.out.println("Result is "+Arrays.stream(names).map(x->{
		   System.out.println(x+" is being processed");
		   return x.toUpperCase();
	   }).anyMatch(x->{
		    return x.length()>=3;
	   }));
    }
}
