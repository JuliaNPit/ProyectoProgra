package edu.uptc.LOGICA;

public interface ActionsCharge {
	
	public class Charge implements ActionsCharge {
	    private int loadedAmount = 0;

	    public void load() {
	        
	    	if (loadedAmount < 10) {
	           
	    		System.out.println("Cargando volqueta");
	           
	    		loadedAmount++;
	        
	    	} else {
	          
	    		System.out.println("La volqueta se encuentra en su capacidad maxima");
	        }
	    }
	   
	    public void dump() {
	        
	    	if (loadedAmount > 0) {
	           
	    		System.out.println("Descargando volqueta");
	            loadedAmount--;
	        } else {
	            
	        	System.out.println("La volqueta no se encuentra cargada");
	        }
	    }
	}
}
