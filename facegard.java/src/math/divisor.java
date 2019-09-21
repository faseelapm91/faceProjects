package math;
import java.util.Scanner;

public class divisor {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println("the divisors of the numbers are");
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				
	    System.out.println(i+" ");
	    sum=sum+i;
			}
	}
	System.out.println();
		System.out.println("the sum of divisors are"+sum);
	if(sum==n)
	{
    System.out.println("it is a perfect number");
	}
	else
	{
		System.out.println("it is not a perfect number");

	}

}
}	
	


