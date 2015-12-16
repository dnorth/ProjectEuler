
public class Problem_6 {
	
	public static void main(final String[] args) {
		double firstNum = 0;
		double secondNum = 0;
		
		for(int i=1; i <= 100; i++)
		{
			firstNum+= Math.pow(i, 2);
			secondNum+= i;
		}
		secondNum = Math.pow(secondNum, 2);
		System.out.println("Answer: " + (secondNum - firstNum));
	}
}
