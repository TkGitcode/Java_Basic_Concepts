/** 
* @Author -- TkGitcode
*/
public class Garbage_collection {

	public static void main(String[] args) {
		
		thismethod a1;
        a1=new thismethod(50,10);
        System.out.println(a1.getval()); 
        a1=null; //Its is Dereference (Garbage collection)
        System.out.println(a1.getval());  //in this place It shows a Nnull pointer Error
        new thismethod(56,20); //it is Anonymous Object

	}

}
