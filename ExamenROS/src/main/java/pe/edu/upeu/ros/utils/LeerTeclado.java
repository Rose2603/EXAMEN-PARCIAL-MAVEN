package pe.edu.upeu.ros.utils;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

public class LeerTeclado {
    BufferedReader leerTecla = new BufferedReader(new InputStreamReader(System.in));
   //EJERCICIOS
    public int leer(int dato, String mensaje){
        try {
            System.out.println(mensaje);
            dato=Integer.parseInt(leerTecla.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    //MENU
    public String leer(String mensaje1, String mensaje2){
        try {
            System.out.println(mensaje2);
            mensaje1=leerTecla.readLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return mensaje1;  
  }
} 