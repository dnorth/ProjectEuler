
public class Problem_5 {

	public static void main(final String[] args) {

		double count = 1;
		boolean found = false;
		while(!found)
		{
			found = true;
			for(int i=1; i < 21; i++)
			{
				if((count / i) % 1 != 0)
				{
					found = false;
					break;
				}
			}
			count++;
		}
		
		System.out.println("Answer: " + (count-1));
	}
}
