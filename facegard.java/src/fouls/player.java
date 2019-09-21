package fouls;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class player {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
int num,n,c=0;
		
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players");
		num=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of fouls made by each player");
		int arr[]=new int[num];
		for(n=0;n<num;n++)
		{
			arr[n]=sc.nextInt();
		}
		int min = arr[0];
		int flag=0,k;
		for( k=1;k<num;k++)
	       {
			if(arr[k]<min)
			{
				min=arr[k];
				flag=k;
			}
	       }
	// if(c==min)
  	   
  	//for(int i=0;i<num;i++)
  	
  
  	System.out.println("The eligible player is player number"+k);
  

	}     

}

	


