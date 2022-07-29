/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.ArrayList;
import paquete02.PlanCelular;

/**
 *
 * @author josed
 */
public class Factura {

    private double pagoMensualTotal;
    private ArrayList<PlanCelular> lista;

    public void establecerLista(ArrayList<PlanCelular> l) {
        lista = l;
    }

    public void establecerPagoMensualTotal(double p) {
        for (PlanCelular plan : lista) {
            pagoMensualTotal += plan.obtenerPagoMensual();
        }
    }

    public double obtenerPagoMensualTotal() {
        return pagoMensualTotal;
    }

    public ArrayList<PlanCelular> obtenerLista() {
        return lista;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        for(int i = 0; i < lista.size(); i++){
            cadena = String.format("%s%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%sValor Mensual Total a pagar: %.2f", cadena, 
                pagoMensualTotal);
        
      return cadena;
    }
}
