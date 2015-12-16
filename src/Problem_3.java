import java.util.ArrayList;
import java.util.List;


public class Problem_3 {

	public static void main(final String[] args) {

		long number= 600851475143L;
		int count = 2;
		List<Integer> primes = new ArrayList<Integer>();
		while(number > 1)
		{
			if(number % count == 0)
			{
				number = number/count;
				primes.add(count);
				count = 1;
			}
			count++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(Integer i : primes)
		{
			sb.append(i + "\t");
		}
		
		System.out.println(sb.toString());
	}
	
	
}
