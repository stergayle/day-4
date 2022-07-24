package training;

public class question2 {

	
	
	public static void main(String[] args) {
		
		StringBuffer myStringBuff = new StringBuffer("Hello");
		
		System.out.println(myStringBuff.capacity());
		
		myStringBuff.append(", Sterling");
		
		
		System.out.println(myStringBuff);
		
		myStringBuff.delete(0, 7);
		
		
		System.out.println(myStringBuff);



	}

}

