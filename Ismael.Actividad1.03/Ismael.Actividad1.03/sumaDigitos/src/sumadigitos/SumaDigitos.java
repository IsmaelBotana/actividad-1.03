/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadigitos;

/**
 *
 * @author Usuario
 */
public class SumaDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contar dígitos Iterativa
        int probar1 = sumDigitIt(1234);
        System.out.println(probar1);
        // Contar dígitos Recursiva
        int probar2 = sumDigitRe(505);
        System.out.println(probar2);

    }

    public static int sumDigitIt(int n1) {
        int suma = 0;
        while (n1 > 0) {
            suma += n1 % 10;
            n1 = n1 / 10;
        }
        return suma;
    }

    public static int sumDigitRe(int n2) {
        if (n2 == 0) {
            return 0;
        } else {
            return (n2 % 10) + sumDigitRe(n2 / 10);
        }
    }

}
