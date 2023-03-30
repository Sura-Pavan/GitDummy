package PKG1;

public class Consstructor {
	
	int s;
	int aa;
	Consstructor()
	{
		s=00;
		aa=11;
		System.out.println("I am Default Consructor");
		System.out.println(s);
		System.out.println(aa);
	
	}
	 Consstructor(int a,String b)
	 {
		 int c=a;
		String d=b;
		System.out.println("I am Parameter Consructor");
		System.out.println(c);
		System.out.println(d);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Consstructor a=new  Consstructor();
		a.s=33;
		 System.out.println(a.s);
		 
		 Consstructor b=new  Consstructor(2,"PAVAN");
		 b.aa=111;
		 System.out.println(b.aa);
		 
	}

}
