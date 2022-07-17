/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import paquete02.PlanCelular;

/**
 *
 * @author josed
 */
public class PlanPostPagoMinutosMegas extends PlanCelular {

    private int minutos;
    private double costoMinutos;
    private int gigas;
    private double costoGigas;

    public PlanPostPagoMinutosMegas(String n, String c, String ciu, String marC,
            String moC, int nc, int m, double cm, int g, double cgb) {
        super(n, c, ciu, marC, moC, nc);
        minutos = m;
        costoMinutos = cm;
        gigas = g;
        costoGigas = cgb;
    }

    public void establecerMinutos(int m) {
        minutos = m;
    }

    public void establecerCostoMinutos(double cm) {
        costoMinutos = cm;
    }

    public void establecerGigas(int g) {
        gigas = g;
    }

    public void establecerCostoGigas(double cgb) {
        costoGigas = cgb;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (gigas * costoGigas);
    }

    public int obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public int obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nPlan Post Pago Minutos Megas\n"
                + "\tMinutos: %d\n"
                + "\tCosto minutos: %.2f\n"
                + "\tGigas: %d\n"
                + "\tCosto gigas: %.2f\n", super.toString(), 
                minutos, costoMinutos, gigas, costoGigas);
        return cadena;
    }
}
