

/** 
* @Author -- TkGitcode
*/
class Incomingcall implements Runnable //Here Implements Runnable is Interface //We can also write a class as anonymous inside the main class
{
	 public void run() //Here run() is thread Method
	{
		for(int i=0;i<5;i++)
		{
			try {Thread.sleep(800);}catch (InterruptedException e) {} //Here I used Thread.sleep to delay my process
			System.out.println("IncomeCall..");
		}
	}
}
class Playsong implements Runnable
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
public class ThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		Runnable c=new Incomingcall(); //here we create Reference variable(interface Runnable)
		Runnable k=new Playsong();
		/*Here .start,.isAlive,.join is all is Method of Thread but not for Runnable interface*/
		Thread t,t1; //So we creating a Object for Thread class
		t=new Thread(c); 
		t1=new Thread(k);
		t.setName("Incomingcall"); //Setting the name for Object(t or t1) of Thread class
		System.out.println(t.getName()); //getting a name of Object where created for thread class
		t1.setName("Playsong");
		t.start(); 
		
		if(t.isAlive()) 
		System.out.println("Yes Your thread is still running ");
		
		t.join();
		t1.start();//Playing Song..
		 
		
		System.out.println("I am Not Thread");/*Here this print Statement will print 1st Because above two thread's are doing there job they 
		                                        will not disturb Main class continuity(when .join not in above)*/
		

	}

}
