package com.circuit;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceOperation {
     public static void main(String n[]) {
    	 Stream<Integer> stream=Stream.of(1,233,35,34,546,45,4546,34,3436,645,3454564,53,3434,4);
    	 Stream<Integer> stream2=Stream.of(2,435,534,3423,34,35,36,4,23435,3434,53,4,34,534,3,2);
    	 
    	Optional<Integer> result=stream.reduce((x,y)->x>y?x:y);
    	
    	System.out.println(result.get());
    	
        result=stream2.reduce((x,y)->x+y);
    	
    	System.out.println(result.get());
     }
}
