package com.git.practice.rai;

import java.util.stream.Collectors;

public class ReverseStringUsingStream {
	
	public static void main(String[] args) {
		
		String input = "Hello, world!";
		
		//reverse the string using java Streams
		String reversed = input.chars().mapToObj(c -> String.valueOf((char)c))
				.collect(Collectors.collectingAndThen(Collectors.toList(),
						list -> {
							java.util.Collections.reverse(list);
							return list.stream().collect(Collectors.joining());
						}
						));
		
		//print the reversed string
		System.out.println("Reversed string: " + reversed);
	}

}
