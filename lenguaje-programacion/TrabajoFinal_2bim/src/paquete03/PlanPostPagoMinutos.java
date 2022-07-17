/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.PlanCelular;

/**
 *
 * @author josed
 */
public class PlanPostPagoMinutos extends PlanCelular {

    private int minutosNacionales;
    private double costoNacional;
    private int minutosInternacionales;
    private double costoInternacional;
    

    public PlanPostPagoMinutos(String n, String c, String ciu, String marC,
            String moC, int nc, int mn, double cn, int mi, double ci) {
        super(n, c, ciu, marC, moC, nc);
        minutosNacionales = mn;
        costoNacional = cn;
        minutosInternacionales = mi;
        costoInternacional = ci;
    }

    public void establecerMinutosNacionales(int mn) {
        minutosNacionales = mn;
    }

    public void establecerCostoNacional(double cn) {
        costoNacional = cn;
    }

    public void establecerMinutosInternacionales(int mi) {
        minutosInternacionales = mi;
    }

    public void establecerCostoInternacional(double ci) {
        costoInternacional = ci;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (minutosNacionales * costoNacional)
                + (minutosInternacionales * costoInternacional);
    }

    public int obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoNacional() {
        return costoNacional;
    }

    public int obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public double obtenerCostoInternacional() {
        return costoInternacional;
    }

    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nPlan Post Pago Minutos\n"
                + "\tMinutos nacionales: %d\n"
                + "\tCosto nacional: %.2f\n"
                + "\tMinutos internacionales: %d\n"
                + "\tCosto internacional: %.2f\n",
                super.toString(),
                minutosNacionales, costoNacional, minutosInternacionales,
                costoInternacional);
        return cadena;
    }
}
