package exceptions;

public class Demo1 
{
	public static void main(String[] args) 
	{
		 System.out.println(10/0);

			try {
				System.out.println("line 1");
				 System.out.println(10/0);
				System.out.println("line 2");
			} 
			catch (ArithmeticException e) // Execption e = new ArithmeticException()
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				  
			}
			catch (NullPointerException e) // Execption e = new ArithmeticException()
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				  
			}
			catch (Exception e) // Execption e = new ArithmeticException()
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				  
			}
			finally
			{
				//clean up
				System.out.println("finally executed");
			}
			
			
		
		
		
		
	}

}
