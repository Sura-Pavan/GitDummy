package PKG1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ps1 extends ps {
	
	@BeforeTest
public void buf() {
		
	System.out.println("I AM HERE");
	}
	
	
	@Test
	public void sub() {
		
		int a=3;
		Ps2 ob=new Ps2(a);

		add();
		System.out.println(ob.Increment());
		System.out.println( ob.Decrement());
	}

}
