
public class Fibonacci
{
	public static void main (String [] args)
	{
		int sum=0;
		int i=1;
		for(int j=0;j<=10;)
		{
	sum=i+j;
			i=j;
			j=sum;
		
			}
		System.out.println(sum);
			
	}
}

	
