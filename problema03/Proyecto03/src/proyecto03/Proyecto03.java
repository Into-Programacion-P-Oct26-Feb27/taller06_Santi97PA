/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto03;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Proyecto03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre = "";
        int tipoEmpleado = 0;
        int anosServicio = 0;
        double sueldoInicial = 0;
        double porcentajeIncremento = 0;
        int porcentajeEntero = 0;
        double bonificacion = 0;
        double incrementoSalarial = 0;
        double nuevoSueldo = 0;
        
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese el tipo de empleado (1-5 o más): ");
        tipoEmpleado = entrada.nextInt();

        System.out.print("Ingrese los años de servicio: ");
        anosServicio = entrada.nextInt();

        System.out.print("Ingrese el sueldo inicial: ");
        sueldoInicial = entrada.nextDouble();
        
        switch (tipoEmpleado) {
            case 1:
                porcentajeIncremento = 0.05;
                porcentajeEntero = 5;
                break;
            case 2:
                porcentajeIncremento = 0.07;
                porcentajeEntero = 7;
                break;
            case 3:
                porcentajeIncremento = 0.09;
                porcentajeEntero = 9;
                break;
            case 4:
                porcentajeIncremento = 0.12;
                porcentajeEntero = 12;
                break;
            default: 
                porcentajeIncremento = 0.15;
                porcentajeEntero = 15;
                break;
        }
        
        if (anosServicio < 2) {
            bonificacion = 0.0;
        } else if (anosServicio < 5) {
            bonificacion = 30.0;
        } else if (anosServicio < 10) {
            bonificacion = 60.0;
        } else {
            bonificacion = 100.0;
        }
        
        incrementoSalarial = sueldoInicial * porcentajeIncremento;
        nuevoSueldo = sueldoInicial + incrementoSalarial + bonificacion;
        
        System.out.printf("\nREPORTE DE INCREMENTO SALARIAL\n\n"
                        + "Empleado: %s\n"
                        + "Tipo de empleado: %d\n"
                        + "Años de servicio: %d\n\n"
                        + "Sueldo inicial: $%.2f\n"
                        + "Porcentaje de incremento: %d%%\n"
                        + "Incremento salarial: $%.2f\n"
                        + "Bonificación por antigüedad: $%.2f\n\n"
                        + "Nuevo sueldo: $%.2f\n",
                nombre, 
                tipoEmpleado, 
                anosServicio, 
                sueldoInicial, 
                porcentajeEntero, 
                incrementoSalarial, 
                bonificacion, 
                nuevoSueldo);
       
    }
}
    
    

