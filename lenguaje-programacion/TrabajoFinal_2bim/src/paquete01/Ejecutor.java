/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete02.PlanCelular;

import paquete03.PlanPostPagoMinutos;
import paquete04.PlanPostPagoMegas;
import paquete05.PlanPostPagoMinutosMegas;
import paquete06.PlanPostPagoMinutosMegasEconomico;
import paquete07.Enlace;

/**
 *
 * @author josed
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        //ArrayList<PlanCelular> lista = new ArrayList<>();
        Enlace e = new Enlace();
        boolean bandera = true;

        while (bandera) {
            System.out.println("----------SELECCIONE UNA OPCIÓN----------");
            System.out.println("[1] Plan Post Pago Minutos");
            System.out.println("[2] Plan Post Pago Megas");
            System.out.println("[3] Plan Post Pago Minutos y Megas");
            System.out.println("[4] Plan Post Pago Minutos y Megas Económico");
            System.out.println("[5] Salir");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el número de cédula: ");
                    String numero = sc.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    String ciudad = sc.nextLine();
                    System.out.print("Ingrese el marca de celular: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese el modelo de celular: ");
                    String modelo = sc.nextLine();
                    System.out.print("Ingrese el número de celular: ");
                    String numeroCelular = sc.nextLine();
                    System.out.print("Ingrese el número de minutos nacionales: ");
                    int minutosN = sc.nextInt();
                    System.out.print("Ingrese el costo de minutos nacionales: ");
                    double costoMinutosN = sc.nextDouble();
                    System.out.print("Ingrese el número de minutos internacionales: ");
                    int minutosI = sc.nextInt();
                    System.out.print("Ingrese el costo de minutos internacionales: ");
                    double costoMinutosI = sc.nextDouble();
                    PlanPostPagoMinutos a = new PlanPostPagoMinutos(
                            nombre, numero, ciudad, marca, modelo,
                            numeroCelular, minutosN, costoMinutosN, minutosI,
                            costoMinutosI);
                    a.establecerPagoMensual();
                    e.insertarPostPagoMinutos(a);
                    //lista.add(a);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingrese el número de cédula: ");
                    numero = sc.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Ingrese el marca de celular: ");
                    marca = sc.nextLine();
                    System.out.print("Ingrese el modelo de celular: ");
                    modelo = sc.nextLine();
                    System.out.print("Ingrese el número de celular: ");
                    numeroCelular = sc.nextLine();
                    System.out.print("Ingrese el número de megas en Gigas: ");
                    int numeroMegas = sc.nextInt();
                    System.out.print("Ingrese el costo de megas: ");
                    double costoMegas = sc.nextDouble();
                    System.out.print("Ingrese la tarifa base: ");
                    double tarifaBase = sc.nextDouble();
                    PlanPostPagoMegas b = new PlanPostPagoMegas(
                            nombre, numero, ciudad, marca, modelo,
                            numeroCelular, numeroMegas, costoMegas, tarifaBase);
                    b.establecerPagoMensual();
                    e.insertarPostPagoMegas(b);
                    //lista.add(b);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingrese el número de cédula: ");
                    numero = sc.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Ingrese el marca de celular: ");
                    marca = sc.nextLine();
                    System.out.print("Ingrese el modelo de celular: ");
                    modelo = sc.nextLine();
                    System.out.print("Ingrese el número de celular: ");
                    numeroCelular = sc.nextLine();
                    System.out.print("Ingrese el número de minutos: ");
                    int minutos = sc.nextInt();
                    System.out.print("Ingrese el costo de minutos: ");
                    double costoMinutos = sc.nextDouble();
                    System.out.print("Ingrese el número de megas en Gigas: ");
                    numeroMegas = sc.nextInt();
                    System.out.print("Ingrese el costo de las megas: ");
                    costoMegas = sc.nextDouble();
                    PlanPostPagoMinutosMegas c = new PlanPostPagoMinutosMegas(
                            nombre, numero, ciudad, marca, modelo,
                            numeroCelular, minutos, costoMinutos, numeroMegas,
                            costoMegas);
                    c.establecerPagoMensual();
                    e.insertarPostPagoMinutosMegas(c);
                    //lista.add(c);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre = sc.nextLine();
                    System.out.print("Ingrese el número de cédula: ");
                    numero = sc.nextLine();
                    System.out.print("Ingrese la ciudad: ");
                    ciudad = sc.nextLine();
                    System.out.print("Ingrese el marca de celular: ");
                    marca = sc.nextLine();
                    System.out.print("Ingrese el modelo de celular: ");
                    modelo = sc.nextLine();
                    System.out.print("Ingrese el número de celular: ");
                    numeroCelular = sc.nextLine();
                    System.out.print("Ingrese el número de minutos: ");
                    minutos = sc.nextInt();
                    System.out.print("Ingrese el costo de minutos: ");
                    costoMinutos = sc.nextDouble();
                    System.out.print("Ingrese el número de megas en Gigas: ");
                    numeroMegas = sc.nextInt();
                    System.out.print("Ingrese el costo de las megas: ");
                    costoMegas = sc.nextDouble();
                    System.out.println("Ingrese el porcentaje de descuento: ");
                    double porcentajeDescuento = sc.nextDouble();
                    PlanPostPagoMinutosMegasEconomico d
                            = new PlanPostPagoMinutosMegasEconomico(
                                    nombre, numero, ciudad, marca,
                                    modelo, numeroCelular, minutos,
                                    costoMinutos, numeroMegas,
                                    costoMegas, porcentajeDescuento);
                    d.establecerPagoMensual();
                    e.insertarPostPagoMinutosMegasEc(d);
                    //lista.add(d);
                    break;
                case 5:
                    System.out.println("----------"
                            + "GRACIAS POR USAR NUESTRO SISTEMA"
                            + "----------");
                    bandera = false;
                    break;
                default:
                    System.out.println("\nOPCIÓN INVÁLIDA\n");
                    break;
            }
        }
        
        System.out.println("------------------------------PLAN POST PAGO "
                    + "MINUTOS -------------------------------");
        for (int i = 0; i < e.obtenerDataPostPagoMinutos().size(); i++) {
            
            System.out.printf("%s\n", e.obtenerDataPostPagoMinutos().get(i));
        }
        
        System.out.println("------------------------------PLAN POST PAGO "
                    + "MEGAS -------------------------------");
        for (int i = 0; i < e.obtenerDataPostPagoMegas().size(); i++) {
            
            System.out.printf("%s\n", e.obtenerDataPostPagoMegas().get(i));
        }
        
        System.out.println("------------------------------PLAN POST PAGO "
                    + "MINUTOS MEGAS -------------------------------");
        for (int i = 0; i < e.obtenerDataPostPagoMinutosMegas().size(); i++) {
            
            System.out.printf("%s\n", e.obtenerDataPostPagoMinutosMegas().get(i));
        }
        
        System.out.println("------------------------------PLAN POST PAGO "
                    + "MINUTOS MEGAS ECONOMICO-------------------------------");
        for (int i = 0; i < e.obtenerDataPostPagoMinutosMegasEc().size(); i++) {
            
            System.out.printf("%s\n", e.obtenerDataPostPagoMinutosMegasEc().get(i));
        }

    }
}
