package PKG1;

//public class AstralianTraffic implements Interface,ContinentalTraffic {
public class AstralianTraffic implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface a=new AstralianTraffic();
		a.greenGo();
		a.Flashyellow();
		a.redstop();
		AstralianTraffic b=new AstralianTraffic();
		b.sportlight();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implement");
		System.out.println(a);
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implement");
	}

	@Override
	public void Flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("flash implement");
		
	}
	public void sportlight() {
		System.out.println("sportlight implement");
		
	}

}