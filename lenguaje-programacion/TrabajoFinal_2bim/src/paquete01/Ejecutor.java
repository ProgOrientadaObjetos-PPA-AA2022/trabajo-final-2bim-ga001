/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete03.PlanPostPagoMinutos;
import paquete04.PlanPostPagoMegas;
import paquete05.PlanPostPagoMinutosMegas;
import paquete06.PlanPostPagoMinutosMegasEconomico;

/**
 *
 * @author josed
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PlanPostPagoMinutos a = new PlanPostPagoMinutos("Jose", "1104805609",
                "Loja", "Apple", "Iphone 7", 995146968, 45, 2.1, 21, 3.5);

        a.establecerPagoMensual();

        System.out.println(a);

        PlanPostPagoMegas b = new PlanPostPagoMegas("Jose", "1104805609",
                "Loja", "Apple", "Iphone 7", 995146968, 5.1, 1.9, 64.1);

        b.establecerPagoMensual();

        System.out.println(b);

        PlanPostPagoMinutosMegas c = new PlanPostPagoMinutosMegas("Jose", "1104805609",
                "Loja", "Apple", "Iphone 7", 995146968, 60, 3.4, 6, 3.5);

        c.establecerPagoMensual();

        System.out.println(c);

        PlanPostPagoMinutosMegasEconomico d = new PlanPostPagoMinutosMegasEconomico("Jose", "1104805609",
                "Loja", "Apple", "Iphone 7", 995146968, 100, 1.1, 7, 3.8, 8);

        d.establecerPagoMensual();

        System.out.println(d);
    }

}
