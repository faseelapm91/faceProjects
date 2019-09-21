package ncr;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n,r;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a value of n");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter a value of r");
		r=Integer.parseInt(br.readLine());
		long n1=1,r1=1;
		long s;
		long s1=1;
		for(int i=1;i<=n;i++)
		{
			n1=n1*i;
		}
		//System.out.println(n1);
		for(int i=1;i<=r;i++)
		{
			r1=r1*i;
		}
		//System.out.println(r1);
		s=n-r;
		
		for(int i=1;i<=s;i++)
		{
			s1=s1*i;
		}
	
				
		long ncr=n1/(r1*s1);
		System.out.println("The NCR factor of given value is " +ncr);
	}

}
