

/*
 * class Plane {
    public List<String> passengers;
    public int maxPassengers;
    public Date lastTimeTookOf;
    public Date lastTimeLanded;
}
 */

import java.util.Date;

class Plane {
	
	  private String[] passengers;
	  private int maxPassengers;
	  private Date lastTimeTookOf;
	  private Date lastTimeLanded;
	  private int index = 0;

	  //Adding the methods
	  //Defining the onboarding method.
	  void onboard(String str){
		  passengers[index]=str;
		  index++;
	  }
	
	  
	  //Defining the Current Date method 
	  Date takeOff(){
		  Date currentDate = new Date();
		  return currentDate;
	  }
	  
	  //Defining the Land method
	  void land(){
		  this.lastTimeLanded = takeOff();
		  this.passengers = new String[maxPassengers];
	  }
	  
	  //Defining the Get Last Time Landed method.
	  Date getLastTimeLanded() {
		return this.lastTimeLanded;  
	  }
	  
	  //Defining the Get Passengers method.
	  
	  String[] getPassengers() {
		  return this.passengers;
	  }
	  
	  
Plane (int dhaniRam ){
	this.maxPassengers = dhaniRam;
	this.passengers = new String[dhaniRam];
}
}
