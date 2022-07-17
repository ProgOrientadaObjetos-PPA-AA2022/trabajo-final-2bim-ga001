/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import paquete02.PlanCelular;

/**
 *
 * @author josed
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    private int minutos;
    private double costoMinutos;
    private int gigas;
    private double costoGigas;
    private int porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(String n, String c, String ciu, String marC,
            String moC, int nc, int m, double cm, int g, double cgb, int pd) {
        super(n, c, ciu, marC, moC, nc);
        minutos = m;
        costoMinutos = cm;
        gigas = g;
        costoGigas = cgb;
        porcentajeDescuento = pd;
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

    public void establecerPorcentajeDescuento(int pd) {
        porcentajeDescuento = pd;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (gigas * costoGigas);
        pagoMensual = pagoMensual - (pagoMensual * (porcentajeDescuento / 100));
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

    public int obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nPlan Post Pago Megas Economico\n"
                + "\tMinutos: %d\n"
                + "\tCosto minutos: %.2f\n"
                + "\tGigas: %d\n"
                + "\tCosto gigas: %.2f\n"
                + "\tPorcentaje de descuento: %d\n", super.toString(),
                minutos, costoMinutos, gigas, costoGigas, porcentajeDescuento);
        return cadena;
    }
}
