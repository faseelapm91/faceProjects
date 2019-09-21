
package numbers;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class sum {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		int n=0,sum=0;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("Enter a number");
		n=Integer.parseInt(br.readLine());
		
		}while(n<0);
	     sum =n*(n+1)/2;
	     System.out.println(sum);
		
			
		}
	}
	


