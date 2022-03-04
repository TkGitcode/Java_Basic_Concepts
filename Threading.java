package Stack;
/** 
* @Author -- TkGitcode
*/
class Incomingcall extends Thread //Here extends tread is Inheritance
{
	synchronized public void run() //Here run() is thread Method
	{
		for(int i=0;i<5;i++)
		{
			try {Thread.sleep(800);}catch (InterruptedException e) {} //Here I used Thread.sleep to delay my process
			System.out.println("IncomeCall..");
		}
	}
	
}
class Playsong extends Thread
{
	public void run()
	{
	   for(int i=0;i<5;i++)
	   {
		   try {
			Thread.sleep(600);
		} catch (InterruptedException e) {}
           System.out.println("Playing Song..");
	   }
	}
}
public class Threading {

	public static void main(String[] args) throws InterruptedException {
		Incomingcall c=new Incomingcall();
		Playsong k=new Playsong();
		c.start();//Incoming call..
		
		if(c.isAlive()) //Here thread(class)
			System.out.println("Yes Your thread is still running ");
		
		c.join();/*.join is used to, if the c.start thread is running 
                    but I need, no other process would be disturb during the tread running so we use .join(until the thread execute)*/ 
		k.start();//Playing Song..
		 
		
		System.out.println("I am Not Thread");/*Here this print Statement will print 1st Because above two thread's are doing there job they 
		                                        will not disturb Main class continuity*/
		

	}

}
