package edu.uptc.LOGICA;

public class Passenger {
	
	private byte numPassengers;
	
	public void Passengers(byte numPassengers) {
	        
		  this.numPassengers = numPassengers;
	    
	  }
	    
	    public int getNumPassengers() {
	        return numPassengers;
	    }
	    
	    public void setNumPassengers(byte numPassengers) {
	    	
	        this.numPassengers = numPassengers;
	    }
	    public String toString() {
	        return "Passenger {" +
	                "numPassengers = " + numPassengers +  
	                '}';
	    }
	    
}

