package week1.day2;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		
		int number = 13;
		boolean flag = false;
		for (int i=2; i<=number/2; i++)
		{
			int remainder = number % i;
			if(remainder == 0)
			{
				flag = true;
				break;
			}
		}
			if(!flag)
			{
				System.out.println("This is a Prime number:" +number);
			}
			else
			{
				System.out.println("This is not a Prime number:" +number);
			}
	}
}
		
		
  
	
		



