/** 
* @Author -- TkGitcode
*/
class thismethod
{
	int a; //Instance Variable
	int b;
	thismethod(int a,int b) //Method Variable
	{
		this.a=a;  /*(this) keyword is used to get the value from the Instance variable 
		             because Instance variable name and method parameter variable are same*/
		this.b=b;
	}
	int getval()
	{
		return a+b;
	}
	
}
public class this_operator {

	public static void main(String[] args) {
		thismethod a1=new thismethod(25,10); 
	    
		System.out.println(a1.getval()); 

	}

}
