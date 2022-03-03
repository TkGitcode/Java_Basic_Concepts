/** 
* @Author -- TkGitcode
*/
/*Enum is Constant Value*/
enum Days 
{
	/*Here we Store a Weekly days from Monday to Sunday
       */
	MONDAY("Mon"),TUESDAY("Tue"),WEDNESDAY("Wed"),THURSDAY("Thu"),FRIDAY("Fri"),SATURDAY("Sat"),SUNDAY("Sun"); 
	public String e;
	Days(String e1) //Just creating a Constructor to class 
	{
		e=e1; //It Receive String of constant in enum example: MONDAY String value Mon
	}
	public String gete()
	{
		return e; //When we call gete() Method it returns String value
	}
}

public class Enum {

	public static void main(String[] args) {
		Days d= Days.TUESDAY; //creating a object for Days
		System.out.println(d);
		System.out.println(d.gete()); //Calling a Method
		System.out.println(d.ordinal()); //Position of Enum Constant 
		System.out.println(d.toString()); //Converting Enum(Constant value)into String

	}

}
