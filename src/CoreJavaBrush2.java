import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrush2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int numbers [] = {2,8,934,5,1};
//	    
//	    System.out.println ("first element is " +numbers[0]);
//	    System.out.println("last element is " + numbers[numbers.length - 1]);
//	    System.out.println("second last element is "+ numbers[numbers.length - 2]);
//	    for (int r =numbers.length -1; r >=0; r--)
//	    System.out.println("array in reverse order is "+ numbers[r]);
//		int[] arr2 = {33,789,5,6,22,454,7,8}; 
//		// print values which can be multiplied by 2
//		for (int i = 0; i<arr2.length; i++)
//		{
//			if (arr2[i] % 2 ==0)
//			{
//				System.out.println(arr2[i]);
//				break; // breal can be removed as per our wish
//			}
//			else
//			{
//				System.out.println(arr2[i]+"is not multiple of 2");
//			}
//		}
	    
	    // Arraylist declaration
//		ArrayList <String> a = new ArrayList<String>();
//		a.add("BCCI");
//		a.add("BCCI2");
//		a.add("BCCI3");
//		a.add("BCCI4");
//		System.out.println(a.get(2));
//		
//		for (int i =0; i<a.size(); i++)
//		{
//			System.out.println(a.get(i)); // to print all values in a arraylist
//		}
//		System.out.println("***********");
//		for (String val : a)
//		{
//			System.out.println(val);
//		}
//		System.out.println(a.contains("BCCI4 "));
		
		String name [] = {"sachin", "pooja", "golu"}; // converting normal array as arraylist
		List<String> newarraylist = Arrays.asList(name);
		// newarraylist will be new variable name which we are storing 
		// newarraylist will be converted as list ant this list shoud be of string type hence defined
		// Arrays.asList(name) is used to convert normal static array to arraylist
		newarraylist.contains("sachin");
		
	}

}
