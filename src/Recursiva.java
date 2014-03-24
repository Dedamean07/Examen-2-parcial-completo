
 /* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Denis
 */
public class Recursiva {

    public static int recur(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return recur(n-1) * recur(n-2) + n;
        }
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int nn = dato.nextInt();

        System.out.println(recur(nn));
    }
}