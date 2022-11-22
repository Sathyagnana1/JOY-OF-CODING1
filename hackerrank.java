//hacker rank 2d problem
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int ar[][]=new int[6][6];
		int big=-1;
		for (int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
				ar[i][j]=ob.nextInt();
		}
		for (int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				int sum=0;
				sum=ar[i][j]+ar[i][j+1]+ar[i][j+2]+ar[i+1][j+1];
				sum=sum+ar[i+2][j]+ar[i+2][j+1]+ar[i+2][j+2];
				if(sum>big)
					big=sum;
			}
		}
		System.out.println(big);
		}
}
