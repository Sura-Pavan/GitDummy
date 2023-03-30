package PKG1;

public class child extends Parent {
	int a=111;
	public child()
	{
		super();
		System.out.println("Child constructor");
	}
	public child(int a)
	{
	
		super();
		System.out.println("aaaa Child constructor");
	}
	public void show()
	{
		 System.out.println(a);
	System.out.println(super.a);
	}
	public void get()
	{
		super.get();
	 System.out.println("I am child");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.show();
		c.get();
	}

}
