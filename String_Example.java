package Stack;
/** 
* @Author -- TkGitcode
*/
public class String_Example {
/*Here is Difference between String and String Buffer*/
	public static void main(String[] args) { 
		String c="";
		String d="Hello";
		String arr[]= {"Muthu","Venkat","Samuvel"};
		for(String i:arr)
		{
			c=d+i; //Here when we concatenate a String with c it store a string in separate object for each and every time 
			System.out.println(c.hashCode());
			System.out.println(c);
		}
		System.out.println();
		StringBuffer b=new StringBuffer("");
		for(String i:arr)
		{
			//Here when we concatenate a String with c it store or appending a string in Single object for each and every time 
			System.out.println(b.append(i));
			System.out.println(b.hashCode());
		}
		/*String Buffer and  String Builder are Same
		  But stringBuffer is Thread Safe and all the method of StringBuffer is Synchronized,
		  But stringBuilder is Not a Thread Safe and  the method are not  Synchronized*/

	}

}
