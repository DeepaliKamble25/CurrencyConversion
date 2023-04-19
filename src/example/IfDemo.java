package example;

public class IfDemo {

	public static void main(String[] args) {
		
		int x=0;
		
		if(x)//Type mismatch: cannot convert from int to boolean
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("hi");
		}
		

	}

}
