
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Soniguales {
    static boolean sonigualess(int num1,int num2){
        if(num1==num2){
        return true;
        }else return false;
        
       
            
        }
     public static void main(String[] args){
         Scanner dato = new Scanner(System.in);
         System.out.print("Ingrese numero 1: ");
         int n1= dato.nextInt();
         System.out.print("Ingrese numero 2: ");
         int n2= dato.nextInt();
         
         System.out.println(sonigualess(n1,n2));     
    }
}