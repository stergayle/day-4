package training;

public class question3 {

	
	
	public static void main(String[] args) {
		
		StringBuilder myStringBuild = new StringBuilder("Hello");
		
		System.out.println(myStringBuild.capacity());
		
		myStringBuild.append(", Sterling");
		
		
		System.out.println(myStringBuild);
		
		myStringBuild.delete(0, 7);
		
		
		System.out.println(myStringBuild);

	}

}

