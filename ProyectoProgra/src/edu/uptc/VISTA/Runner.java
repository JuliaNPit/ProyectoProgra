package edu.uptc.VISTA;

import java.util.Scanner;

import edu.uptc.LOGICA.DumpTrck;
import edu.uptc.LOGICA.Passenger;
import edu.uptc.LOGICA.Truck;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Passenger p1 = new Passenger();
		
		p1.toString();
		
		int op =0; 
		
		while (op!=3) {
			System.out.println("---Elija el tipo de vehiculo--- \n"+""
					+ "1. Camion   \n"
					+ "2. Camión de la basura \n"
					+ "3. Salir ");
			try {
				   op=sc.nextInt();
				} catch ( java.util.InputMismatchException e) {
				  
				   System.out.println("Error: de digitacion");
				  
				   op=3;
				}
					
				switch (op) {
				case 1: 
					 Truck t1 = new Truck ();
					 t1.Truck(null, null, 0, null);
					break; 
				case 2:
					DumpTrck d1 = new DumpTrck();
					d1.DumbTrck(null, null, 0, null);
					break;
				case 3: 
					break;
					default:
						System.out.println("Opción no valida ");
						break;
				}
			
		}
		
		
	}

	

	

}
