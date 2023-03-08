package edu.uptc.LOGICA;

public abstract class Vehicle {
	
	private String plate=""; 
		
	private String mark;
	
	private short model=0;
	
	private String color=""; 
	
	private boolean state ;
	
	private float speed;
	

	public Vehicle() {
		super();
	}


	public String getPlate() {
		
		return plate;
		
	}
	public void setPlate(String plate) {
		
		this.plate = plate;
		
	}
	public String getMark() {
		
		return mark;
	}
	
	public void setMark(String mark) {
		
		this.mark = mark;
	}
	public int getModel() {
		
		return model;
	}
	
	public void setModel(short model) {
		
		this.model = model;
	}
	
	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public float getSpeed() {
		
		return speed;
		
	}
	
	public void setSpeed(float speed) {
		
		this.speed = speed;
		
	}
	
	    public boolean encender() {
	    	
	        if (!state) {
	            state = true;
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public boolean apagar() {
	        if (state) {
	            state = false;
	            return true;
	        } else {
	            return false;
	        }
	    }
	    public Vehicle(boolean state, int speed ) {
	        this.state = state;
	        this.speed = speed;
	       
	      
	    }
	    public float speedUp(int units) {
	        
	    	if (!state) {
	            return -100;
	        }
	        
	        if (speed + units <= 120) {
	            speed += units;
	           
	            return speed;
	        
	        } else {

	            speed = 120;
	            
	            return speed;
	        }
	    }

	    public float brake(double porcentajeFrenado) {
	       
	    	if (state && speed > 0) {
	            int brake = (int) (speed * porcentajeFrenado);
	            speed -= brake;
	            
	            if (speed < 0) {
	                speed = 0;
	            }
	            
	            return speed;
	        
	        }else {
	            return -100;
	        }
	    }
	    public String toString() {
	        return "Vehicle {" +
	                "plate = " + plate +  
	                ", mark = " + mark +
	                ", color =" + color +
	                '}';
	    }
		
	    
}
