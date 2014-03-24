/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Denis
 */
public class SopaDeLetras {
    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        char[][] sopa = {{'P','A','B','C','D','E','D','G','H','R'},
                         {'A','E','0','N','M','L','E','J','M','A'},
                         {'Q','R','R','S','T','U','L','W','L','T'},
                         {'Z','B','C','R','F','G','F','I','K','O'},
                         {'A','G','A','T','O','B','I','B','J','N'},
                         {'A','Q','V','X','D','E','N','G','J','A'},
                         {'A','W','N','Z','D','G','M','W','I','B'},
                         {'A','R','M','Q','S','H','K','U','H','C'},
                         {'A','T','P','U','A','P','L','X','G','D'},
                         {'A','U','I','H','A','H','M','E','D','E'}};                
        
        System.out.println("**********************************");
        for(int i=0; i<10; i++)
        { 
            System.out.print("*  ");
            for(int j=0; j<10; j++)
            {                
                System.out.print(sopa[i][j] + "  ");
            }
            System.out.print("*");
            System.out.println();
        }                               
        System.out.println("**********************************");       
        System.out.println("Busca las 5 palabras, tienes 3 vidas");
        
        String respuesta;
        Scanner scan = new Scanner(System.in);
        
        int vidas = 3;
        int palabrasencontradas = 0;
        
        while (vidas > 0 && palabrasencontradas < 5)
        {
            System.out.println("Vidas = " + vidas + "     Palabras = " + palabrasencontradas);
            System.out.println("Ingresar Palabra: ");
            respuesta = scan.next();
            respuesta=respuesta.toUpperCase();
        
            if (respuesta.equals("PERRO") || respuesta.equals("RATON") || respuesta.equals("AHMED") || respuesta.equals("DELFIN") || respuesta.equals("GATO"))
            {
                palabrasencontradas++;
            }
            else
            {
                vidas--;
            }                                              
        }   
        if (vidas == 0)
        {
            System.out.println("GAME OVER :(");
        }
        else
        {
            System.out.println("WINNER¡¡¡¡");
            
            
        }
    }          
}