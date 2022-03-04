/** 
* @Author -- TkGitcode
*/
class Mobile
{
	synchronized void Speaker(String n) /*Here i used a synchronized for, if any thread calls this Method 
	                                      1st Thread will Execute fully and then next thread will execute*/	
	{	
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(n+" Hearing..");
			} catch (InterruptedException e) {}
		
		}
	}
}
public class Synchronized_Example {

	public static void main(String[] args) {
		Mobile b=new Mobile();//Creating a Object for a Class
		Thread t=new Thread() //Creating a Object for a Thread class
				{
			     public void run() //Here i @override a run() method of thread class
			     {
			    	 b.Speaker("Incoming call"); //calling a Speaker method
			     }
				};
				Thread t1=new Thread()
						{
					public void run()
					{
						b.Speaker("Song");
				}
		};
		t.start(); //Starting a Thread //IncomeCall 
		t1.start(); //Song

	}

}
