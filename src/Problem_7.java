
public class Problem_7 {
	
	public static void main(final String[] args) {

		boolean prime = false;
		int count = 6;
		int number = 14;
		
		
		while(count < 10001)
		{
			
			prime = true;
			for(int i=2; i < number; i++)
			{
				if(number % i == 0)
				{
					prime = false;
				}
			}
			if(prime)
			{
				count++;	
			}
			number++;
		}
		
		System.out.println("Answer: " + (number-1));
	}
}
