package week.day1;

public class IsPrime {

		public static void main(String arg[])	
		{
	 
	    int n=19;
		int count=0;
		for(int i=1;i<=n;i++)
		{
		   if(n%i==0)
		   {
		        count++;	        
		   }
		}
		if(count==2)
		       System.out.println("prime number ");
		else
		System.out.println("Not a prime number ");        
	   } 
	}
