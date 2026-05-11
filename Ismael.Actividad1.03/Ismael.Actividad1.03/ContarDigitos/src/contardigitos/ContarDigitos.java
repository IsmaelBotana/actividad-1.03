/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contardigitos;

/**
 *
 * @author Usuario
 */
public class ContarDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contar dígitos Iterativa
        int probar1 = contarDigitIt(7);
        System.out.println(probar1);
        // Contar dígitos Recursiva
        int probar2 = contarDigitRe(1234);
        System.out.println(probar2);
    }

    public static int contarDigitIt(int n1) {
        if (n1 == 0)
            return 1;
        int contador = 0;
        while (n1 > 0) {
            n1 /= 10;
            contador++;
        }
        return contador;
    }

    public static int contarDigitRe(int n2) {
        // Caso base: si el número es < 10, tiene un dígito
        if (n2 < 10) {
            return 1;
        }
        return 1 + contarDigitRe(n2 / 10);
    }

}
