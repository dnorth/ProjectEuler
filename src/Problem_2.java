
public class Problem_2 {

	public static void main(final String[] args) {

		long firstNum = 1;
		long secondNum = 2;
		long thirdNum = 0;
		long four_million = 4000000L;
		long count = 0;
		while(secondNum < four_million)
		{
			if(secondNum % 2 == 0)
			{
				count += secondNum;
			}
			thirdNum = firstNum + secondNum;
			
			firstNum = secondNum;
			secondNum = thirdNum;
		}
		
		System.out.println("\n\n Answer: " + count);
	}
	
}
