package gold;
import java.util.Scanner;
public class item {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the kgs of gold");
		int n=sc.nextInt();
		int d=0;
		int num=n/5;
		if(num>5)
		{
			d=num/5;
			
		}
		n=n+num+d;
	
       System.out.println("Number of sculptors can be made is"+n);
}
}