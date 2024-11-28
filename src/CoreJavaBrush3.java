
public class CoreJavaBrush3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String as an object // defining string using string string literal
//		String s = "sachin sarsambe";
//		String s2 = "sachin sarsambe";
//		String s3 = "hello";
	// in java, value of s and s2 will be same, jdk will use s2 as s and and s2 have same value 
		
		// String as an object // defining string using new keyword 
		String s4 = new String ("welcome");
		String s5 = new String ("welcome");
	
	//	in java, value of s4 and s5 will be different, 
		
		String s = "sachin sarsambe suchitra";
		String[] splittedstring = s.split(" ");
		System.out.println(splittedstring[0]);
		System.out.println(splittedstring[1]);
		System.out.println(splittedstring[2]);
		System.out.println("******");
		String[] splittedstring1 = s.split("sarsambe");
		System.out.println(splittedstring1[0]);
		System.out.println(splittedstring1[1]);
		for (int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
			System.out.println(s.length());
		}
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		}
	

}
