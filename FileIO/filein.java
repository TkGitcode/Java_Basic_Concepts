package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/** 
* @Author -- TkGitcode
*/
public class filein {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream filin=new FileInputStream("D:fileout.txt"); /*File Input Stream is used to get the value from the File(D:fileout.txt)*/
			
			int i;
			while((i = filin.read()) !=-1) //Here -1 is When the file has no value then while condition will be false
			{
				System.out.println((char)i); //Here I change i i char because i is in Integer value 
			}
			filin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
