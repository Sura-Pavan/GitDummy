package PKG1;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> ha=new HashSet<String>();
		ha.add("UK");
		ha.add("INDIA");
		ha.add("USA");
		ha.add("INDIA");
		System.out.println(ha);
		System.out.println(ha.contains("AFRIKA"));
		System.out.println(ha.isEmpty());
		System.out.println(ha.size());
	//	System.out.println(ha.remove("UK"));
		System.out.println(ha);
//		ha.clear();
//		System.out.println(ha);
		
		Iterator<String>i=ha.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
