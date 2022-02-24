package Stack;
/** 
* @Author -- TkGitcode
*/
class object1
{
	 int a;
	 String b;
	 int c;
	 object1(int a,String b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	 object1(object1 o) /*Constructor with object parameter it is named as copy constructor*/
	 {
		 a=o.a;
		 b=o.b;
		 c=o.c;
		 System.out.println(a + " " +b+ " "+c+" ");
	 }
	 boolean isEqual(object1 o)               /*Here we passing Object(object1) is parameter */
	 {
		 if(o.a==a && o.b==b && o.c==c)
			 return true;
		 return false;
	 }
}
public class passing_object_as_Argument {

	public static void main(String[] args) {
		object1 ob1;
		object1 ob2,ob3;
		ob1 =new object1(45,"Ji",21);
		ob2 =new object1(45,"Ji",21);
		
		System.out.println(ob1.isEqual(ob2));  /*Here we passing a Object as a Argument
		                                         to check both object is Equal or Not*/
		
		
         ob3 = new object1(ob1); /*Here we pass the one object(ob1) value to 
                                  another object(ob3) 
                                   using by creating a constructor with object parameter */
	}

}
