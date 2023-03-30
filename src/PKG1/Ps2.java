package PKG1;

import org.testng.annotations.Test;

@Test
public class Ps2 {
	
	int a;
	public Ps2(int a) {
		this.a=a;
	}
	public int Increment()
	{
		a=a+1;
		return a;
		
	}
	public int Decrement()
	{
		a=a-1;
		return a;	
	}

}
