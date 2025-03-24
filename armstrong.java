
public class armstrong {
	public static void main(String[]args)
	{
		int sum=0;
		int num=153;
		int cube;
		int temp=num;
		while(num>0)
		{
			cube=num%10;
			num=num/10;
			sum=sum+(cube*cube*cube);
		
		}
		if(temp==sum)
			System.out.println("armstrong");
		else 
			System.out.println("not armstrong");
		}
}
		
