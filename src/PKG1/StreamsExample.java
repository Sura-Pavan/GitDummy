package PKG1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> a=new ArrayList<String>();
		
		//Stream.of("pavan","kalyan","karna","subbu","pani").filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//Stream.of("pavan","KalYan","KarNa","subbu","pani").filter(s->s.startsWith("K")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
		
		/*List<String>b=Arrays.asList("pavan","KalYan","KarNa","subbu","pani");
		a.add("UK");
		a.add("UNION");
		a.add("CANADA");
		a.add("USA");
		
//		int count=0;
		/*
		for(int i=0;i<a.size();i++)
		{
			String s=a.get(i);
			if(s.startsWith("U"))
			{
				count++;
			}
		}
		System.out.println(count);*/
		
//		long x=a.stream().filter(s->s.startsWith("U")).count();
//		System.out.println(x);
//		
//		List<String>ls=Stream.of("pavan","kalyan","karna","subbu","pani").filter(s->s.startsWith("p")).collect(Collectors.toList());
////		a.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
//		System.out.println(ls.get(1));
		System.out.print("The maximum number is: " +Math.min(10,2)); 

	}

	
}
