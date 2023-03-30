package PKG1;

public class ChildInheritance extends Inheritance1 {
	
	public void sss()
	{
		
		System.out.println(d);
		System.out.println("derived");
		System.out.println(n);
	}
	public void add()
	{
		System.out.println("new bass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildInheritance a= new ChildInheritance();
		//a.d=999;
		a.add();
	//	a.sss();

	}

}
