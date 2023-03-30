package PKG1;

import java.util.ArrayList;

public class ArrayList123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(23);
		a.add(45);
		a.add(45);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains(2));
		System.out.println(a.size());
		a.add(2, 33);
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf(33));

	}

}
