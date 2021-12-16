package com.circuit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectIt {
   public static void main(String n[]) {
	  
	   Stream<Integer> stream=Stream.of(23,535,343,43,34,325,56,34,66,3466,34,366,34,663,342);
	   
	   List<Integer> list=stream.filter(x->{
	   System.out.println("Processed->"+x);
	   return x>100;}).limit(3).collect(Collectors.toList());
	   
	   System.out.println(list);
	   
	   
   }
}
