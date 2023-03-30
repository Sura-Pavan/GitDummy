package PKG1;

public class TirupatiTraffic implements centralization,chennaiTraffic{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		centralization a=new TirupatiTraffic();
		a.Red();
		a.Green();
		a.Yellow();
		System.out.println(a.b);

		
		TirupatiTraffic b=new TirupatiTraffic();
		b.walking();
		chennaiTraffic c=new TirupatiTraffic();
				c.add();

	}

	@Override
	public void Red() {
		System.out.println("Red Stop");
		
	}
	
	
	public void walking()
	{
		System.out.println("walk");
	}

	@Override
	public void Yellow() {
		System.out.println("Yellow Stop");
		
	}

	@Override
	public void Green() {
		System.out.println("Green Stop");
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		System.out.println("TTTTTT");
	}

}
