package com.qa.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Streams {
public static void main(String[] args) {
	

	
	//List<String> names = Arrays.asList("Ed","Reece","Sue","Leon", "Earl");
	
	
//	Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".
//	("Michael", "Dean", "James", "Chris")
	
	
	//List<String> noJList = namesList.stream().filter(e -> e.startsWith("J")).collect(Collectors.toList());
	
	List<String> namesList = Arrays.asList("Micheal","Dean","James","Chris");
	List<String> hiList = namesList.stream().filter (e -> !e.contains("James")).map(e -> "Hello " + e ).collect(Collectors.toList());
	hiList.add("James");
	hiList.stream().forEach(e -> System.out.println(e));
	
	namesList.stream().map(n -> !"James".equalsIgnoreCase(n) ? "Hello ".concat(n) : n).forEach(System.out::println);
	
//	List<String> endList = hiList.stream().sorted().collect(Collectors.toList());
//	endList.stream().forEach(e -> System.out.println(e));


	List<Integer> nums = Arrays.asList(3,4,7,8,12);
	int multi = nums.stream().reduce((a,b) -> a*b).get();
    System.out.println(multi);
     
     
    
    List<Integer> numTwo = Arrays.asList(3,4,7,8,12);
    int [] num = {3,4,7,8,12};
    int max = Arrays.stream(num).max().getAsInt();
    int min = Arrays.stream(num).min().getAsInt();
    
    System.out.println(max);

}    

}

