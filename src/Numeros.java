/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Numeros {
    
      public static void main(String[] args) {
    Scanner dato= new Scanner(System.in);
    
    int nota[] = new int [20];
    int suma=0;
    for (int i=0; i<20; i++){
        System.out.print("Ingrese numero "+(i+1)+": ");
        nota[i]=dato.nextInt();
        suma=suma+nota[i];
        
        }
    System.out.println ("El promedio es: "+suma/20);
    
    
    dato.close();
    
      }
}

   