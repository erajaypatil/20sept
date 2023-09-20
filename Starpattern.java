package javabasicpracitse;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		
		//left ascending
		
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
		
	//right decending
	
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
	
	
	//right ascending
	int space2=0;
	int star2=5;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=space2;j++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=star2;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		space2++;
		star2--;
	}
	
	
	//right decedinging
	
	
	int space3=5;
	int star3=1;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=space3;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star3;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		space3--;
		star3++;
	}
	
	
	
	///////numeric reverse
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the value:");
	
	int num=s.nextInt();
	
	int rev=0;
	
	while(num!=0)
	{
		rev=rev*10 + num%10;
		num=num/10;
	}
	
	System.out.println(rev);
	
	
	/////////reverse Stirng
	
	String name="ajay";
	
	String rev1="";
	
	int len=name.length();
	
	for(int i=len-1;i>=0;i--)
	{
		rev1=rev1+name.charAt(i);
	}
	System.out.println("reverse Sting is "+rev1);
	
	
	}

}
