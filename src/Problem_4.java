public class Problem_4 {

	int number = 0;

	
	public static void main(final String[] args) {

		Problem_4 pro = new Problem_4();
		int final_num = 0;
		for(int i=999; i > 100; i--)
		{
			for(int j=999; j > 100; j--)
			{
				pro.number = i*j;
				if(pro.checkPalindrome())
				{
					if(pro.number > final_num)
					{
						final_num = pro.number;
					}
				}
			}

		}
		
		System.out.println("Your Biggest Number: " + final_num);
	}
	
	public boolean checkPalindrome()
	{
		String splice = Integer.toString(number);
		
		char[] arr = splice.toCharArray();
		boolean palindrome = true;
		for(int i=0; i < arr.length/2; i++)
		{
			if(arr[i] != arr[arr.length - (i+1)])
			{
				palindrome = false;
			}
		}
		
		return palindrome;
	}
}
