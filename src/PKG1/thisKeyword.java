package PKG1;

public class thisKeyword {
	
	int a=333;
	public void add()
	{
		int a=444;
		System.out.println(a);
		System.out.println(this.a);
		int c=a+this.a;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisKeyword s=new thisKeyword();
		s.add();
	}

}
