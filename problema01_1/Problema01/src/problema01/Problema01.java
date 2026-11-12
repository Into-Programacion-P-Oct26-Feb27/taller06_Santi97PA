/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double num1;
        double num2;
        double resultado = 0;
        int opcion;

        System.out.println("===== OPERACIONES ARITMETICAS =====");

        // Ingresar los dos numeros
        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();

        System.out.println("\nSeleccione una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");

        System.out.print("Ingrese su opcion: ");
        opcion = entrada.nextInt();

        if (num1 > num2) {

            if (opcion == 1) {

                resultado = num1 + num2;

                System.out.printf("\nResultado: $.2f", resultado);

            } else if (opcion == 2) {

                resultado = num1 - num2;

                System.out.printf("\nResultado: %.2f ", resultado);

            } else if (opcion == 3) {

                resultado = num1 * num2;

                System.out.printf("\nResultado: %.2f ", resultado);

            } else if (opcion == 4) {

                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("\nResultado: %.2f", resultado);
                } else {
                    System.out.println("Error: No se puede dividir para cero.");
                }

            } else if (opcion == 5) {

                if (num2 != 0) {
                    resultado = num1 % num2;
                    System.out.printf("\nResultado: %.2f" + resultado);
                } else {
                    System.out.println("Error: No se puede calcular el modulo con cero.");
                }

            } else if (opcion == 6) {

                resultado = Math.pow(num1, num2);

                System.out.printf("\nResultado: %.2f", resultado);

            } else {

                System.out.println("Opcion no valida.");

            }

        } else {

            System.out.println("\nNo es posible realizar la operacion.");
            System.out.println("El primer numero debe ser mayor que el segundo.");

        }

        
    }
}
    
    

