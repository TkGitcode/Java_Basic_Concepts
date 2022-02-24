/** 
* @Author -- TkGitcode
*/

class Retobjdemo
{
	int l,b;
	Retobjdemo(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	Retobjdemo doubletheValue()    //Here the  return type is  object(Retobjdemo)
	{
		Retobjdemo temp=new Retobjdemo(2*l,2*b);    //here we doubling the value of l and b
		return temp;  // and we returning a object 
	}
}
public class ReturnObject {

	public static void main(String[] args) {
		Retobjdemo ro,ro1,ro2;
		ro= new Retobjdemo(45,8);
		
		ro1=ro.doubletheValue();   /*Here we passing a object as Method */
		
		System.out.println(ro1.l + " "+ ro1.b);
	}

}
