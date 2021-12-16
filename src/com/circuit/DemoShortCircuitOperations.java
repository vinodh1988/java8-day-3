package com.circuit;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class DemoShortCircuitOperations {
	public static void main(String n[]) {
		String names[]= {"Joseph","Arjun","Manish","Jack","Laury","Harry",
				"Rickey","Shravan","Jay","Shaun","Ram","Krishna","Nicholas","Jerry"};
		Stream<String> stream = Arrays.stream(names);
		
		Optional<String> result=stream.filter(x->{
			System.out.println(x+" is processed");
			return x.startsWith("J");
		}).findFirst();
		
		String output= result.isPresent()?result.get():null;
		
		System.out.println(output);
		
		System.out.println("-----------------------------");
		
		stream=Arrays.stream(names);
		stream=stream.parallel();
		
		result=stream.filter(x->{
			System.out.println(x+" is processed");
			return x.startsWith("J");
		}).findAny();
		
		output= result.isPresent()?result.get():null;
		
		System.out.println(output);

	}
	

}
