package edu.uptc.LOGICA;

public abstract class Charge extends Vehicle{
	
	private float capacity;
	private boolean single; 
	private float maxSpeed;
	
	public void Charge (){
		
	}
	public float getCapacity() {
	
		return capacity;
	
	}
	public void setCapacity(int capacity) {
	
		this.capacity = capacity;
	
	}
	public boolean isSingle() {
		
		return single;
	
	}
	public void setSingle(boolean single) {
		
		this.single = single;
	
	}
	public float getMaxSpeed() {
		
		return maxSpeed;
	
	}
	public void setMaxSpeed(int maxSpeed) {
		
		this.maxSpeed = maxSpeed;
	
	}
	public String toString() {
        return "Truck {" +
                "capacity = " + capacity +  
                ", single = " + single +
                '}';
    }
	
}
