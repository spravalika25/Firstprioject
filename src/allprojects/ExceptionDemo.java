package allprojects;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("start");
try
{
		int c=10/0;
		 System.out.println("Result is "+c);
		 
}catch (ArithmeticException b)
{
	System.out.println("wrong message" +b.getMessage());
	
	}
System.out.println("end");
}

}
