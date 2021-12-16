package com.circuit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortCollect {
    public static void main(String n[]) {
    	String names[]= {"Joseph","Arjun","Manish","Jack","Laury","Harry",
				"Rickey","Shravan","Jay","Shaun","Ram","Krishna","Nicholas","Jerry"};
		Stream<String> stream = Arrays.stream(names);
		
		/*stream.filter(x->x.length()>3).sorted().forEach(System.out::println);*/
		
		stream.filter(x->{
			System.out.println("Processing->"+x);
			return x.length()>3;
		}).sorted( (x,y)->{
			            System.out.println("Sorting logic->"+x+" "+y);
			            return -1*x.compareTo(y);
		         }
				
			).forEach(x->{
			System.out.println("Received ->"+x);
		});
		
		
    }
}
