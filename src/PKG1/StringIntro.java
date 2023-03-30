package PKG1;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="pavan";
		String s2="pavan";
		
		s1.concat("kalyan");
		System.out.println(s1);
		StringBuffer sb=new StringBuffer("pAaVn");
		sb.append("KaLyAn");
		System.out.println(sb);
		sb.insert(2, "he");
		System.out.println(sb);
		sb.replace(5,7,"man");
		System.out.println(sb);
		sb.deleteCharAt(13);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(s1.equals(s2));
		System.out.println(sb.equals(s1));
		System.out.println(s1.equals(sb));
		

	}

}
