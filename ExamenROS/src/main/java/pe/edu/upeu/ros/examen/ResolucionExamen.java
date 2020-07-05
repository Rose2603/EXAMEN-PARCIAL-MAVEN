package pe.edu.upeu.ros.examen;

import java.util.Scanner;
import java.util.Vector;

public class ResolucionExamen {
    
//EJERCICIO 1-------------------------------------------------
	public void EJERCICIO1(){
		Scanner input = new Scanner(System.in);
    	
        System.out.print("Ingrese número de vehículos que posee: ");
        int num = input.nextInt(); 
        System.out.print("Ingrese precio en $ del vehículo categoría 1: ");
        int precio1 = input.nextInt(); 
        System.out.print("Ingrese precio en $ del vehículo categoría 2: ");
        int precio2 = input.nextInt(); 
        System.out.print("Ingrese precio en $ del vehículo categoría 3: ");
        int precio3 = input.nextInt(); 
        
        double imp1 = 0;
        double imp2 = 0;
        double imp3 = 0;
        double imp1_total = 0;
        double imp2_total = 0;
        double imp3_total = 0;
        double impuesto = 0;
		
		for(int n=1;n<=num;n+=1) {
			 System.out.println(String.format("Seleccione la categoría del vehiculo %s: (1), (2) o (3): ",n));
		     int cat = input.nextInt(); 
		     
		     if (cat == 1) {
		    	 imp1 = precio1*0.1;
		    	 System.out.println(String.format("El impuesto por este vehículo es: %s: ",imp1));
		         imp1_total = imp1_total + imp1;
		     }
		     else if (cat == 2) {
		    	 imp2 = precio2*0.07;
		    	 System.out.println(String.format("El impuesto por este vehículo es: %s: ",imp2));
		         imp2_total = imp2_total + imp2;    	 
		     }
		     else if (cat == 3) {
		    	 imp3 = precio3*0.05;
		    	 System.out.println(String.format("El impuesto por este vehículo es: %s: ",imp3));
		         imp3_total = imp3_total + imp3;
		     }
		    
		}
		impuesto = imp1_total+imp2_total+imp3_total;
		
		System.out.println(String.format("El impuesto por todos los vehículos de categoría 1 es: %s: ",imp1_total));
		System.out.println(String.format("El impuesto por todos los vehículos de categoría 2 es: %s: ",imp2_total));
		System.out.println(String.format("El impuesto por todos los vehículos de categoría 3 es: %s: ",imp3_total));
		System.out.println(String.format("El impuesto TOTAL por todos los vehículos es: %s: ",impuesto));
		
	}

//EJERCICIO 2-----------------------------------------------------------------------------------------------------------------
public void EJERCICIO2(){ 
            int n = 20;
            int m = 10;
            int mul;
            for(int i=1;i<=n;i+=1) {
                System.out.println("TABLA DE MULTIPLICAR DEL "+i+": ");
            
                for(int j=1;j<=m;j+=1) {
                    mul = i*j;
                    System.out.println(String.format(" %s x %s = %s",i,j,mul));
                    
                }		
                
            }
    
        }
    

//EJERCICIO 3----------------------------------------------------------------------------------------------------------------
public void EJERCICIO3(int numero){
    Scanner input = new Scanner(System.in);
    	
        System.out.print("Ingrese cuántos números perfectos quiere calcular: ");
        int num = input.nextInt(); // num = 4 max, con 5 es bastante cálculo;
        
		int n = 1;
		int cont = 0;
		int sum_div;
		int i;
		int j;
		int condicion = 1;
		// Creating an empty Vector 
        Vector<String> Perfectos = new Vector<String>(); 
		while (condicion == 1) {
			sum_div = 0;
			i = 1;
			while (i<n) {
				if (n % i == 0) {
					sum_div = sum_div + i;	
				}
				i = i+1;
			}
			if (sum_div == n) {
				System.out.println(String.format("El número %s es perfecto",n));
				Perfectos.add(String.valueOf(n)); // muestra la lista de Perfectos
				cont = cont+1;
			} 
			else if(sum_div != n) {
				System.out.println(String.format("El número %s no es perfecto",n));
			} 
			n = n+1;
			if(cont == num) {
				condicion = 0;
			}
			
		}
		System.out.println(String.format("En la lista hay %s números perfectos",cont));
		System.out.println(String.format("Los números perfectos son %s: ",Perfectos));

	}
//EJERCICIO 4 ------------------------------------------------------------------------------------
public int EJERCICIO4(int base, int expon){
    int resultado = 0;
    if (expon == 0){
        resultado = 1;
    }
    else if (expon > 0){
        resultado = base * (int)Math.pow(base, expon -1);
    }
    return resultado;
}



    
}