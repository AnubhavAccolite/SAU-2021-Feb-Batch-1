package com.au.spring.java;
import java.util.*;

public class ArithmeticOperations {
	public static void main(String[] args)
    { 
        Scanner in = new Scanner(System.in);
        
        Stack<Integer> op  = new Stack<Integer>();
        Stack<Double> val = new Stack<Double>();
        
        Stack<Integer> optmp  = new Stack<Integer>();
        Stack<Double> valtmp = new Stack<Double>();
        
        System.out.println("Evaluation Of Arithmetic Expression Using Stacks Test\n");
        System.out.println("Enter expression\n");
        String exp = in.next();
        exp = "0" + exp;
        exp = exp.replaceAll("-","+-");
        
        String temp = "";
        for (int i = 0;i < exp.length();i++)
        {
            char ch = exp.charAt(i);
            if (ch == '-')
                temp = "-" + temp;
            else if (ch != '+' &&  ch != '*' && ch != '/')
               temp = temp + ch;
            else
            {
                val.push(Double.parseDouble(temp));
                op.push((int)ch);
                temp = "";
            }
        }
        val.push(Double.parseDouble(temp));
        
        char operators[] = {'/','*','+','%'};
        
        for (int i = 0; i < 4; i++)
        {
            boolean it = false;
            while (!op.isEmpty())
            {
                int optr = op.pop();
                double v1 = val.pop();
                double v2 = val.pop();
                if (optr == operators[i])
                {
                  
                    if (i == 0)
                    {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    }
                    else if (i == 1)
                    {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    }
                    else if (i == 2)
                    {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }                                        
                }
               
                else
                {
                    valtmp.push(v1);
                    val.push(v2);
                    optmp.push(optr);
                }                
            }    
                    
            while (!valtmp.isEmpty())
                val.push(valtmp.pop());
            while (!optmp.isEmpty())
                op.push(optmp.pop());
           
            if (it)
                i--;                            
        }    
        System.out.println("\nResult = "+val.pop());        
    }
	
}