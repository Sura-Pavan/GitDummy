package PKG1;

public class Overloading {
	public void aaa(int a)
	{
		System.out.println(a);
	}
	public void aaa(int a,float b)
	{
		System.out.print(a);
		System.out.println(b);
	}
	public void aaa(String b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading nn=new Overloading();
		nn.aaa(99);
		nn.aaa("PAVAN");
		nn.aaa(12, 987.9f);

	}

}
