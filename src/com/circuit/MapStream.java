package com.circuit;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class MapStream {
     public static void main(String n[]) {
    	 Stream<Integer> one=Stream.of(1,3,4,6);
    	 Stream<Integer> two=Stream.of(12,32,64,26);
    	 Stream<Integer> three=Stream.of(31,73,24,86);
    	 Stream<Integer> four=Stream.of(81,93,44,26);
    	 List<Stream<Integer>> list=Arrays.asList(one,two,three,four);
    	 Stream<Stream<Integer>> stream=list.stream();
    	 System.out.println(stream.map(x->x).collect(Collectors.toList()));
    	 stream=list.stream();
    	 System.out.println(stream.flatMap(x->x).collect(Collectors.toList()));
     }
}
