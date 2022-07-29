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

    private double minutos;
    private double costoMinutos;
    private double gigas;
    private double costoGigas;
    private double porcentajeDescuento;

    public PlanPostPagoMinutosMegasEconomico(String n, String c, String ciu, String marC,
            String moC, String nc, double m, double cm, double g, double cgb, double pd) {
        super(n, c, ciu, marC, moC, nc);
        minutos = m;
        costoMinutos = cm;
        gigas = g;
        costoGigas = cgb;
        porcentajeDescuento = pd;
    }

    public void establecerMinutos(double m) {
        minutos = m;
    }

    public void establecerCostoMinutos(double cm) {
        costoMinutos = cm;
    }

    public void establecerGigas(double g) {
        gigas = g;
    }

    public void establecerCostoGigas(double cgb) {
        costoGigas = cgb;
    }

    public void establecerPorcentajeDescuento(double pd) {
        porcentajeDescuento = pd;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutos * costoMinutos) + (gigas * costoGigas);
        pagoMensual = pagoMensual - (pagoMensual * (porcentajeDescuento / 100));
    }

    public double obtenerMinutos() {
        return minutos;
    }

    public double obtenerCostoMinutos() {
        return costoMinutos;
    }

    public double obtenerGigas() {
        return gigas;
    }

    public double obtenerCostoGigas() {
        return costoGigas;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nPlan Post Pago Megas Economico\n"
                + "\tMinutos: %.2f\n"
                + "\tCosto minutos: %.2f\n"
                + "\tGigas: %.2f\n"
                + "\tCosto gigas: %.2f\n"
                + "\tPorcentaje de descuento: %.2f\n", super.toString(),
                minutos, costoMinutos, gigas, costoGigas, porcentajeDescuento);
        return cadena;
    }
}
