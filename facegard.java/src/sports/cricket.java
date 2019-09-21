package sports;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class cricket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num,n,c=0;
		double sum=0,total,average=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		num=sc.nextInt();
		System.out.println("Enter the runs conceded by the bowlers");
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			{
				arr[i]=sc.nextInt();
			}}
			System.out.println("Enter the number of balls for each bowler");
			double arr1[]=new double[num];
			for(int i=0;i<num;i++)
			{
				arr1[i]=sc.nextDouble();
			}
			System.out.println("Economy of the bowlers is");
			
			
			for(int i=0;i<num;i++)
			{
				sum=arr1[i]/6;
				total=arr[i]/sum;
				average=total/2;
			}
			System.out.println("the overall economy is"+average);
		    if(c<20)
		    	   {
		    	for(int i=0;i<num;i++)
		    	c++;
		    	   }
		    	System.out.println("The number of bowelrs are eligible"+c);
		    
		
	}
	}

