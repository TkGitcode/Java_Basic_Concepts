package FileIO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** 
* @Author -- TkGitcode
*/
public class filout {

	public static void main(String[] args) throws IOException {
		
		try {
			FileOutputStream f=new FileOutputStream("D:fileout.txt"); /*Here I create a File Output Stream to create a new file and 
			                                                            insert value into File which I Created */
			String k="Hi Kumar How are you"; //This is a String i insert into text file
			byte b[]=k.getBytes(); //Compiler convert a String k into byte code
			f.write(b); //And It write a String into file using FileOutput Stream
			f.close(); //Finally close a FileI/O creation
			System.out.println("Success....");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
