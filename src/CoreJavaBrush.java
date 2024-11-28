
public class CoreJavaBrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		String str= "sachn";
		char letter = 'd';
		double dec = 9.32;
		boolean mycard = true;
		System.out.println(num+"is the valus stored in num variable");
		// Arrays
		int[] arr = new int[4]; // Array declaration
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
		int[] arr2 = {5,6,7,8}; // Array declaration shortcut
		System.out.println(arr2[2]);
		
		// For loop
		for (int i=0; i< arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String name [] = {"sachin", "pooja", "golu"};
		for (int i=0;  i<name.length; i++)
		{
		System.out.println(name[i]);
		}
		
		for (String s1: name) //Enhanced for loop systax, for (int i=0;i<name.length;i++)=(String s: name); 
				{
					System.out.println("enhanced for loop is "+s1);
				}
	}

}
