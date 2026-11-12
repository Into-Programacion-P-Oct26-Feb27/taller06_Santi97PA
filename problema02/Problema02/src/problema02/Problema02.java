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
        
        String propietario = "";
        String tipoVehiculo = "";
        int tipo = 0;
        double avaluo = 0;
        double porcentaje = 0;
        double valorFijo = 0;
        double valorBase = 0;
        double recargo = 0;
        double total = 0;
        
        System.out.println("===== PEAJE BUENA VÍA =====");
        System.out.print("Ingrese el nombre del propietario: ");
        propietario = entrada.nextLine();
        
        System.out.println("Ingrese el tipo de vehículo:\n"
                + "1. Vehículo liviano particular\n"
                + "2. Vehículo grande particular\n"
                + "3. Taxi\n"
                + "4. Bus urbano");
        
        tipo = entrada.nextInt(); 

        System.out.print("Ingrese el avaluo comercial: $");
        avaluo = entrada.nextDouble();
        
        if (tipo == 1) {
            tipoVehiculo = "Vehículo liviano particular";
            porcentaje = 0.0001; 
            valorFijo = 2.00;
        } else if (tipo == 2) {
            tipoVehiculo = "Vehículo grande particular";
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
        }
        
        if (tipo >= 1 && tipo <= 4) {
            
            valorBase = (avaluo * porcentaje) + valorFijo;
          
            if ((tipo == 1 || tipo == 2) && avaluo > 30000) {
                recargo = 1.50;
            }
            
            total = valorBase + recargo;

            System.out.printf("%n===== REPORTE DEL PEAJE =====%n%n"
                            + "Peaje: Buena Vía%n"
                            + "Propietario: %s%n"
                            + "Tipo: %s%n"
                            + "   Avaluo: $%.2f%n"
                            + "   Valor base del peaje: $%.2f%n"
                            + "   Recargo: $%.2f%n%n"
                            + "Total a cancelar: $%.2f%n",
                    propietario, tipoVehiculo, avaluo, valorBase, recargo, total);

        } else {
            System.out.printf("%nError: Tipo de vehículo no válido.%n");
        }

      
    }
}