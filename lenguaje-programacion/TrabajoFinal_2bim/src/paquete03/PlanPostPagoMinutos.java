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

    private double minutosNacionales;
    private double costoNacional;
    private double minutosInternacionales;
    private double costoInternacional;
    

    public PlanPostPagoMinutos(String n, String c, String ciu, String marC,
            String moC, String nc, double mn, double cn, double mi, double ci) {
        super(n, c, ciu, marC, moC, nc);
        minutosNacionales = mn;
        costoNacional = cn;
        minutosInternacionales = mi;
        costoInternacional = ci;
    }

    public void establecerMinutosNacionales(double mn) {
        minutosNacionales = mn;
    }

    public void establecerCostoNacional(double cn) {
        costoNacional = cn;
    }

    public void establecerMinutosInternacionales(double mi) {
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

    public double obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public double obtenerCostoNacional() {
        return costoNacional;
    }

    public double obtenerMinutosInternacionales() {
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
                + "\tMinutos nacionales: %.2f\n"
                + "\tCosto nacional: %.2f\n"
                + "\tMinutos internacionales: %.2f\n"
                + "\tCosto internacional: %.2f\n",
                super.toString(),
                minutosNacionales, costoNacional, minutosInternacionales,
                costoInternacional);
        return cadena;
    }
}
