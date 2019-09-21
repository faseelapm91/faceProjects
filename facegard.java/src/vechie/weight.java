package vechie;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class weight {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int n,t=0,c=0,e=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of vechile");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the fare collected for vechile");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i ]=Integer.parseInt(br.readLine());
		}
			
		
			for(int i=0;i<n;i++)
			{
				if(arr[i]<50 && arr[i]>0)
				{
				c++;
				} 
				
				if(arr[i]>50)
				{
					e++;
				}
				
			}
	
			System.out.println("Number of heavy vehicle "+e+" number of  light weight vehicle"+c);
		
		
	}

}

