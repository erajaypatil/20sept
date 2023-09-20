package javabasicpracitse;

public class javacodepar {

	public static void main(String[] args) {
		// array code find even and odd numbers init

		int a[]={1,50,40,22,13,60,80,7894,52452,54879454,14254,658741};

		System.out.println("Even no are..........");

		for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
				}
			}


		//first time i wrote this code into the reomte git hub repositrory
		
		System.out.println("Odd number are..........");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
