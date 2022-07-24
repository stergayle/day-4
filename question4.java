package training;

public class question4 {

	
	
	public static void main(String[] args) {
		
		int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i : myArray)
		{
			if(i % 2 == 0)
			{
				evenSum += i;
			}
			else
			{
				oddSum += i;
			}
		}
		
		System.out.println("Even: " + evenSum);
		System.out.println("Odd: " + oddSum);

	
	}

}

