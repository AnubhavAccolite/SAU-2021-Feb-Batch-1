package com.au.spring.java;
import java.util.*;

public class Substring {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.nextLine();
		System.out.println("Enter the word to be replaced");
		String inp=in.nextLine();
		System.out.println("Enter the word with which to replace");
		String word=in.nextLine();
		String newStr=str.replaceAll(inp,word);
		System.out.println("The original string was: "+str);
		System.out.println("The replaced string is : "+newStr);
		
		
		
		
		
		
	}

}
