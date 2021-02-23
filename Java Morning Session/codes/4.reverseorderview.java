package com.au.spring.java;
import java.util.*;

public class reverseorderview {
	public static void main(String[] args) {
		TreeMap<String,String> treemap= new TreeMap<>();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number of key->value pairs");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Key");
			String key=in.next();
			System.out.println("Enter Value");
			String val=in.next();
			treemap.put(key, val);
		}
		System.out.println("Original key Map: "+treemap);
		System.out.println("Reversed key Map: "+ treemap.descendingKeySet());
	}

}
