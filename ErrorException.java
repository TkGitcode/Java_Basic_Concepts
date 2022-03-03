import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class ErrorException { //Error Exception

	public static void main(String[] args)  {
		int n=10,n1=0;
		
		try /*try is used to check the code inside the body of try, i that if error is occurs then it will catch the error and 
		      catch body will throw a error*/
		{
			/*This Errors are Unchecked error because The complier will not show a error during writing our code*/
			int a[]=null; //throw a NullPointerException
			//System.out.println(a[9]);
			n=n/n1; //throw a ArithmeticException
		}
		catch(NullPointerException  | ArithmeticException e) //We can give multiple catch Exception parameter inside the catch using |(OR)
		{
			//System.err.println(e);
		}
		catch(Exception e)
		{
			//System.err.println(e);
		}
		finally
		{
			//System.out.println("Hello  from Finally "); /*Finally will execute every time,if catch throws error or try has no error 
			//finally will execute */
		}
		/*Check Error*/
		File fe=new File("File.txt");
		try {
			FileInputStream fi=new FileInputStream(fe); //here our complier will show the error during writing a code 
		} catch (FileNotFoundException e) {
			//System.err.println(e); 
			
		}
          try(Scanner sc=new Scanner(System.in)) //To overcome the sc.close(),it is known as try with resource
          {
        	  
          }
          int Mark=0;
    	  int Expected=85;
          try
    	  {
    	  if(Mark<Expected)
          {
        	  throw new NotEligible(Expected-Mark); //User Handle Exception
          }
    	  }
    	  catch(NotEligible e)
    	  {
    		  System.out.println(e+"Take a  Re-attempt ");
    	  }
         
         
	}

}
