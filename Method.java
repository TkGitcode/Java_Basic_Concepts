/** 
* @Author -- TkGitcode
*/
class Addition
{
	int a; //It is Known as Instance Variable
	int b;
	int add()//Method
	{
		return a+b;
	}
}
public class Method {

	static int sum(int a,int b)
	{
		return a+b;
	}
	static double sum(double a,double b) /*It is Know Method Overloading
	                               There should  Must be Parameter differ*/
	{
		return a+b;
	}
	public static void main(String[] args) {
		Addition a1=new Addition(); 
		a1.a=10; /*assing a value to a and b with object(a1)*/
        a1.b=12;
		System.out.println(a1.add()/*This is Know as invoke Method*/ ); 
		
		System.out.println(sum(45,25));
		System.out.println(sum(78.2,456.41));
		/*Example for Method Overload in java is Math.abs(float or int or double)*/
	}

}
