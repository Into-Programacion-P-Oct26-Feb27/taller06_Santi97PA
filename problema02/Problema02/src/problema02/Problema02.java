/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String propietario;
        String tipoVehiculo = "";
        int tipo;
        double avaluo;
        double porcentaje = 0;
        double valorFijo = 0;
        double valorBase; 
        double recargo = 0;
        double total;

        System.out.println("===== PEAJE BUENA VIA =====");

        System.out.print("Ingrese el nombre del propietario: ");
        propietario = entrada.nextLine();

        
        System.out.println("\nTipos de vehiculos:");
        System.out.println("1. Vehiculo liviano particular");
        System.out.println("2. Vehiculo grande particular");
        System.out.println("3. Taxi");
        System.out.println("4. Bus urbano");

        System.out.print("Ingrese el tipo de vehiculo: ");
        tipo = entrada.nextInt();

        
        System.out.print("Ingrese el avaluo comercial: $");
        avaluo = entrada.nextDouble();

       
        if (tipo == 1) {

            tipoVehiculo = "Vehiculo liviano particular";
            porcentaje = 0.0001;
            valorFijo = 2.00;

        } else if (tipo == 2) {

            tipoVehiculo = "Vehiculo grande particular";
            porcentaje = 0.0002;
            valorFijo = 2.50;

        } else if (tipo == 3) {

            tipoVehiculo = "Taxi";
            porcentaje = 0.0004;
            valorFijo = 1.50;

        } else if (tipo == 4) {

            tipoVehiculo = "Bus urbano";
            porcentaje = 0.0005;
            valorFijo = 2.20;

        } else {

            System.out.printf("%nTipo de vehiculo no valido.%n");

        }

       
        if (tipo >= 1 && tipo <= 4) {

            valorBase = (avaluo * porcentaje) + valorFijo;

            
            if ((tipo == 1 || tipo == 2) && avaluo > 30000) {

                recargo = 1.50;

            }

            total = valorBase + recargo;

            System.out.println("\n===== REPORTE DEL PEAJE =====");

            System.out.printf("Peaje: Buena Via%n");
            System.out.printf("Propietario: %s%n", propietario);
            System.out.printf("Tipo: %s%n", tipoVehiculo);
            System.out.printf("Avaluo: $%.2f%n", avaluo);
            System.out.printf("Valor base del peaje: $%.2f%n", valorBase);
            System.out.printf("Recargo: $%.2f%n", recargo);
            System.out.printf("%nTotal a cancelar: $%.2f%n", total);

        }

        
    }
}
    
    
