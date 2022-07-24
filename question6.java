package training;

public class question6 {

	public static void main(String[] args) {
		
		int[][] myArray = { {1, 2}, {3, 4} };
		
		for(int i = 0 ; i < myArray.length ; i++)
		{
			System.out.println();
			for(int j = 0 ; j < myArray[i].length ; j++)
			{
				System.out.print(myArray[i][j]);
			}
		}

	}

}

