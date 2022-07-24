package training;

public class question7 {

	
	
	public static void main(String[] args) {

		int i = 5;
		
		System.out.println("Value of i:" + i);
		
		addByValue(i);
		
		System.out.println("Value of i:" + i);
		
		
		
		i = 5;
		
		System.out.println("Value of i:" + i);
		
		i = addByReference(i);
		
		System.out.println("Value of i:" + i);

	}
	
	static void addByValue(int i)
	{
		i += 100;
		
	}
	
	static int addByReference(int i)
	{
		i += 100;
		return i;
		
	}

}
