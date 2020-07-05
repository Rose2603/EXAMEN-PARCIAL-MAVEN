package pe.edu.upeu.ros;

import pe.edu.upeu.ros.examen.ResolucionExamen;
import pe.edu.upeu.ros.utils.LeerTeclado;
/**
 * By:ROSE
 *
 */
public class App 
{
    public static void main( String[] args ){
        LeerTeclado teclado = new LeerTeclado();
            ResolucionExamen obj = new ResolucionExamen();
            String opcion = "SI";
            int numDeAlgor;
            String mensajeMenu ="1.- El Gerente\n"+
                                "2.- Tabla de Multiplicar\n"+
                                "3.- Los Divisores\n"+
                                "4.- Potencia";
                                    
        do{
            System.out.println( mensajeMenu);

            numDeAlgor = teclado.leer(0, "INGRESE EL ALGORITMO QUE DESEE PROBAR:");
            switch(numDeAlgor){
                case 1:
                obj.EJERCICIO1();        
                break;

            //-------------
                case 2:
                obj.EJERCICIO2();
                break;
    
            //-------------
                case 3:
                int numero = teclado.leer(0, "Ingrese un numero: ");
                obj.EJERCICIO3(numero);
                break;

            //-------------
                case 4:
                int base = teclado.leer(0,"Ingrese la base: ");
                int exp = teclado.leer(0,"Ingrese el exponente: ");
                System.out.println("El resultado es: " + obj.EJERCICIO4(base, exp));

                break;
                default: System.out.println("Num de Algoritmo no existe!!"); break;
            }

            opcion = teclado.leer("", "Desea usted probar mas algoritmos? SI/NO");
        
    }while(opcion.equals("SI") || opcion.equals("si"));
        
    }
}
