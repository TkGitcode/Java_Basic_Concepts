/** 
* @Author -- TkGitcode
*/
import java.lang.reflect.*;
class Ref
{
	void Ref1()
	{
		
	}
	void Ref3()
	{
		
	}
}
public class Reflection {

	public static void main(String[] args) {
		Ref r=new Ref();
		r.Ref1();
		Class c= r.getClass(); //here we can get Class name of Object(r)
		System.out.println(c.getName());
		//Method[] k=c.getMethods();
		//for(Method kum:k)
		//{
		//	System.out.println(kum.getName());
		//}
		

	}

}
