package Stack;
/** 
* @Author -- TkGitcode
*/

public class StackDemo1 {
	private int a[]=new int[10]; //Here private is Access Specifier
	private int LI=-1; //LastIndex(LI)
	void push(int i)
	{
		if(LI==9)
			System.out.println("Stack full");
		else
		   a[++LI]=i;
	}
	int pop()
	{
		if(LI>=0)
		return a[LI--];
		else
		{
			System.out.println("Stack is Empty ");
		return 0;
		}
	}
	int popview(int i)
	{
		return a[i];
	}
	

}
