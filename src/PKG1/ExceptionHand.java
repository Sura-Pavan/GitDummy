package PKG1;

public class ExceptionHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=70;
		int b=0;
		
		try
		{
			int k=a/b;
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
//		catch(ArithmeticException et)
//		{
//		System.out.println("I catched the Arthimetic/exception");
//		}
		catch(IndexOutOfBoundsException ets)
		{
		System.out.println("I catched the IndexBound/exception");
		}
		catch(Exception e)
		{
			System.out.println("catched the error/exception");
		}
		finally
		{
			System.out.println("delete cookies");
		}

	}

}
