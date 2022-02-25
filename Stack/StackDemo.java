package Stack;

import java.util.Arrays;

/** 
* @Author -- TkGitcode
*/
public class StackDemo {

	public static void main(String[] args) {
		StackDemo1 D=new StackDemo1();
		System.out.println(D.pop());
		D.push(1);
		D.push(2);
		D.push(3);
		D.push(4);
		D.push(5);
		D.push(6);
		D.push(7);
		D.push(8);
		D.push(9);
		D.push(10);
		// D.a[9]=90;
		System.out.println(D.pop());
		System.out.println(D.pop());
		System.out.println(D.popview(8));
		D.push(11);
		System.out.println(D.pop());
		

	}

}
