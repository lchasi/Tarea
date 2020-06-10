/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.util.Scanner;

public class Tarea {


    public static void main(String[] args) {
      String nombre,apellido,estadocivil,usuario,password;
        int edad;    
        
        Scanner teclado=new Scanner(System.in); 
        System.out.println("Ingrese su nombre: ");
        nombre = teclado.next();
        System.out.println("Ingrese su apellido: ");
        apellido = teclado.next();
        System.out.println("Ingrese su estado civil: ");
        estadocivil = teclado.next();
        System.out.println("Ingrese su usuario: ");
        usuario = teclado.next();
        System.out.println("Ingrese su password: ");
        password = teclado.next();
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        
        System.out.println( "Su nombre es:  "+nombre+apellido );
        System.out.println( "Su estado civil es:  "+estadocivil );
        System.out.println( "Su usuario es:  "+usuario );
        System.out.println( "Su password es:  "+password );
        System.out.println( "Su edad es:  "+edad );
        

        
        
        boolean sexoM = true;
        boolean sexoF = false;

        if (sexoM) {
            System.out.println("Soy M");
        }

        if (sexoF) {
            // No entra aquí porque sexoF es false
            System.out.println("No soy F");
        }
    }
    
}
