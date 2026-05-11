/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaseguida;

/**
 *
 * @author Usuario
 */
public class SumaSeguida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int comprovacion1;
        int comprovacion2;
        // Versión iterativa
        comprovacion1 = sumSeguidaIt(10);
        System.out.println(comprovacion1);
        // Versión recursiva
        comprovacion2 = sumSeguidaRe(5);
        System.out.println(comprovacion2);
    }

    public static int sumSeguidaIt(int n1) {
        int res = 0;
        for (int i = 0; i <= n1; i++) {
            res += i;
        }
        return res;
    }

    public static int sumSeguidaRe(int n2) {
        if (n2 == 1) {
            return 1;
        } else {
            return n2 + sumSeguidaRe(n2 - 1);
        }
    }

}
