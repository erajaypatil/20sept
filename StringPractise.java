package javabasicpracitse;

import java.util.Scanner;

public class StringPractise {

	public static void main(String[] args) {
		
		String name="AjayRokade";
		
		int len=name.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			
			rev=rev+name.charAt(i);
			
		}
		System.out.println("reverse the string "+rev);
		
		
		
		/////////Reverse Number///////
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int num=s.nextInt();
		
		int reve=0;
		
		//////
		StringBuffer ss=new StringBuffer(String.valueOf(num));
	    StringBuffer number = ss.reverse();
	    System.out.println("reverse string "+number);
	    
	    ////////////Star pattern//////////
	    
	   int star=1;
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=1;j<=star;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	star++;
	    }
	    
	    
	    //decdenidng order
	    
	    int star1=5;
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=1;j<=star1;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	star1--;
	    }
	    
	    
	    ///////////////////////
	    
	    int space=0; 
	    int star12=5;
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=1;j<=space;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	
	    	for(int j=1;j<=star12;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	
	    	System.out.println();
	    	space++;
	    	star12--;
	    	
	    }
	    
	    //////////right ascending
	    
	    int space13=5;
	    int star13=1;
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=1;j<=space13;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	
	    	for(int j=1;j<=star13;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	space13--;
	    	star13++;
	    }
	    
	    
	    //////////////
	    for(int i=1;i<=5;i++)
	    {
	    	System.out.println("*");
	    }
	  //  System.out.println();
	    
	    
	    //////////left acdemging
	    
	    int star14=1;//5
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=1;j<=star14;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	star14++;  //--
	    }
	    
	    
	    /////
	    
	    int star15=5;
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=1;j<=star15;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	star15--;
	    }
	    
	    
	    ////////////////
	    
	    
	   
	    int space16=5;   //0
	    int star16=1;   //5
	    for(int i=1;i<=5;i++)
	    {
	    	for(int j=1;j<=space16;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	
	    	for(int j=1;j<=star16;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    	space16--;  //++
	    	star16++;   //--
	    }
	}

}
