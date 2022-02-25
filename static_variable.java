/** 
* @Author -- TkGitcode
*/
 class staticcount
{
	 int n=0;
	 static int count=0; /*static is not an object based, when we call the class
	                       by object it first runs a static method */
	staticcount(int k,int k1)
	{
		k=10;
		k1=9;
	}
	static void kl()
	{
		System.out.println("Static method");
	}
	void obj1()
	{
		count++;
		n++;
	}
	void obj2()
	{
		count++;
		n++;
	}
	static void staticmethod()
	{
		// n=10;  //Here we cannot use any variable from the class or method Except static variable
		count=9; //we can use count variable because count is static
		kl();  // Here it calls only the static method, It does not call any  method without static
	}

	
}
 class name extends staticcount
 {
	 name(int k,int k1)
	 {
	 super(k,k1);
	 }
 }
public class static_variable {

	
	public static void main(String[] args) {
		staticcount c=new staticcount(10,1);
		c.n=10;
	    c.obj1();
		c.obj2();
		int n=staticcount.count; //here we call the static method by class name
		System.out.println(n);
		System.out.println(c.n); //it is count of n from the class it is called by object name
		
		staticcount.staticmethod(); //Here i call a static method by class name
		
		
        
	}

}
