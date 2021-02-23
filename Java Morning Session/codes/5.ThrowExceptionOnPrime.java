package com.au.spring.java;
import java.util.*;

class PrimeException extends Exception{
	
}
public class ThrowExceptionOnPrime {
	public static boolean isPrime(int n)
	{
		int flag=0;
		int i=2;
		
		while(i<=n/2)
		{
			if(n%i==0)
			{
			flag=1;
			break;}
			++i;
		}
	    if(flag==1 || n==1)
	    	return false;
	    else 
	    	return true;
	}
		
	public static void main(String[] args) {
		int count=1;
		while(count<=100) {
			try {
				if(isPrime(count))
					throw new PrimeException();
			}
			catch(PrimeException e) {
				System.out.println(count+" is a Prime Number");
			}
			finally {
				count++;
			}
		}
	}

}
