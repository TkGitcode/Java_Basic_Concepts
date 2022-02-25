import java.util.Arrays;

/** 
* @Author -- TkGitcode
*/
public class Varargs { // Varargs is Variable length argument

	 static int max(int... v) //here we passing a parameter with data type int
	 {
		 int max=Integer.MIN_VALUE; //Minimum value of Integer
		 for(int i:v) //for each
		 {
			 if(max<i)
			 {
				 max=i;
			 }
		 }
		 return max;
	 }
	public static void main(String[] args) {
		String a1[]= {"Kilo","Milo","Silo","Kamilo"};
		int a[]= {5,4,4,8,6,44,6};
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		int max=max(a);
		System.out.println(max);

	}

}
