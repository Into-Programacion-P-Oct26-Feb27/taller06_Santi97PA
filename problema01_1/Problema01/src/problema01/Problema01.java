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
        
       double num1 = 0;
        double num2 = 0;
        int opcion = 0;
        String nombreOperacion = "";
        double resultado = 0;
        boolean operacionValida = true;

        // Entrada de datos
        System.out.println("===== OPERACIONES ARITMÉTICAS =====");
        System.out.print("Ingrese el primer número: ");
        num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = entrada.nextDouble();

        System.out.println("Seleccione la operación:\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División\n"
                + "5. Módulo (residuo)\n"
                + "6. Potencia");
        
        System.out.print("Ingrese el número de opción: ");
        opcion = entrada.nextInt();

        
        if (num1 > num2) {
            
            
            if (opcion == 1) {
                nombreOperacion = "Suma";
                resultado = num1 + num2;
            } else if (opcion == 2) {
                nombreOperacion = "Resta";
                resultado = num1 - num2;
            } else if (opcion == 3) {
                nombreOperacion = "Multiplicación";
                resultado = num1 * num2;
            } else if (opcion == 4) {
                if (num2 != 0) {
                    nombreOperacion = "División";
                    resultado = num1 / num2;
                } else {
                    operacionValida = false;
                    System.out.println("\nError: El segundo número no puede ser cero para la división.");
                }
            } else if (opcion == 5) {
                if (num2 != 0) {
                    nombreOperacion = "Módulo";
                    resultado = num1 % num2;
                } else {
                    operacionValida = false;
                    System.out.println("\nError: El segundo número no puede ser cero para el módulo.");
                }
            } else if (opcion == 6) {
                nombreOperacion = "Potencia";
                resultado = Math.pow(num1, num2);
            } else {
                operacionValida = false;
                System.out.println("\nError: La opción de operación no es válida.");
            }

            
            if (operacionValida) {
                System.out.printf("%nOPERACIONES ARITMÉTICAS%n%n"
                                + "Primer número: %.2f%n"
                                + "Segundo número: %.2f%n"
                                + "Operación seleccionada: %s%n%n"
                                + "Resultado: %.2f%n",
                        num1, num2, nombreOperacion, resultado);
            }

        } else {
            System.out.println("\nError: El primer número debe ser mayor que el segundo para realizar la operación.");
        }

        entrada.close();
    }
}

           
        

    
    

