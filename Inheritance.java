/** 
* @Author -- TkGitcode
*/
class vehicle                 /*Here vehicle is a Super Class or Base Class*/
{
	protected  String vehicleNumber; /*when we use private to variable it 
	                                cannot be used in other class(sub class)*/
	protected int Priceofvehicle=0;
	//Constructor 
	vehicle(String VN,int VP)
	{
		vehicleNumber=VN;
		Priceofvehicle=VP;
	}
//     vehicle()
//	{
//	} 
                                      /*when we use Empty constructor to not to throw a error
	                                  in sub class and also we can use Super() keyword to sub class to avoid 
	                                  use a empty constructor
	                                  */

	// getValue for vehicleNumber
	String getVN()
	{ return vehicleNumber;  }
	// setValue for vehicleNumber
	void setVN(String sVN)
	{vehicleNumber=sVN;}
	// getValue for Price of vehicle
	int getVP()
	{ return Priceofvehicle;  }
	// setValue for Price of vehicle
	void setVP(int sVP)
	{Priceofvehicle=sVP;}
	
	void IncreaseVP(int iVP)
	{
		Priceofvehicle = Priceofvehicle + iVP;
		System.out.println("Price : "+Priceofvehicle);
	}
	
	
}
class TwoWheeler extends vehicle     /*Here TwoWheeler is Sub class or Derived class , it derived from vechicle */
{
     String VehicleType;
     TwoWheeler(String TWt,String VN,int VP)
     {
    	  super(VN,VP);  //super class to avoid a empty constructor creating in base class
    	 Priceofvehicle=VP;
    	 vehicleNumber=VN;
    	 VehicleType=TWt;
     }
     String getVT()
     {return VehicleType;}
     
     public int getVP()    //Its is Know as Method Overriding
     {
    	 System.out.println("subclass "+super.getVP()+Priceofvehicle);
    	 return super.getVP()+Priceofvehicle;    /*Here super key word get a value from the
    	                                           Base Class */
     }
}
public class Inheritance {

	public static void main(String[] args) {

		//TwoWheeler tw=new TwoWheeler("HeroHonda","TN-K-7586",78500);
		
		vehicle[] vehiclearr =new vehicle[6];
		vehiclearr[0]=new vehicle("TN-7653",56200);
		vehiclearr[1]=new vehicle("TN-9683",66200);
		vehiclearr[2]=new vehicle("TN-1243",76200);
		vehiclearr[3]=new vehicle("TN-9653",86200);
		vehiclearr[4]=new vehicle("TN-7453",96200);
		vehiclearr[5]=new TwoWheeler("HeroHonda","TN-K-7586",78500);
		
		vehiclearr[5].setVP(15000); /*Also we can use like this to set a value for base class but we cannot set the value for 
		                              Derived class(getVT()) because the object is created by only the base class */
		/*if we need to overcome this above statement we can CAST a object */
		if(vehiclearr[5] instanceof TwoWheeler)
		{
		TwoWheeler tw1=(TwoWheeler)vehiclearr[5]; 
		System.out.println("CAST : "+tw1.getVT());
		}
		/*At this time  we cannot CAST the Base class(vehiclearr[4]) because we stored a vehicle details in 
        vehiclearr[4] so we cannot CAST  vehiclearr[4] to check this we can use instanceof */                                      
		/*Instanceof*/
		TwoWheeler tw2;
		if(vehiclearr[4] instanceof TwoWheeler)
		{
		tw2=(TwoWheeler)vehiclearr[4];
		tw2.getVT();
	}
		
		
			
		for(vehicle v:vehiclearr) 
		{
			System.out.println(v.getVN() + "  " + v.getVP());/*Here we used a getVP to get Vehicle price 
            but the last array(vehiclearr[5]) gets from sub class 
            because we use base class object(tw) to the array it is know as 
            dynamic binding */
		}	

		vehicle ve=new TwoWheeler("Yamaha","TN-KK-5622",45000);  /*Here we use both class as 
		                                                           Same object so we can access both base class and sub class
		                                                           using same object name it is know as polymorphism or polymorphi behaviour
		                                                           */
		//TwoWheeler ve=new vehicle() //it is WRONG because it used derived class as a main object 
		ve.IncreaseVP(4500);
		System.out.println(ve.getVP());
		
		
		
	}

}
