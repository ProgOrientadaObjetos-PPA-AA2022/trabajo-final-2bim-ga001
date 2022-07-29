/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import paquete02.PlanCelular;

/**
 *
 * @author josed
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double gb;
    private double costoGb;
    private double tarifaBase;

    public PlanPostPagoMegas(String n, String c, String ciu, String marC,
            String moC, String nc, double gib, double cgb, double tb) {
        super(n, c, ciu, marC, moC, nc);
        gb = gib;
        costoGb = cgb;
        tarifaBase = tb;
    }

    public void establecerGb(double gib) {
        gb = gib;
    }

    public void establecerCostoGb(double cgb) {
        costoGb = cgb;
    }

    public void establecerTarifaBase(double tb) {
        tarifaBase = tb;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = ((gb*1000) * costoGb) + tarifaBase;
    }

    public double obtenerGb() {
        return gb;
    }

    public double obtenerCostoGb() {
        return costoGb;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nPlan Post Pago Megas\n"
                + "\tGigas: %.2f\n"
                + "\tCosto gigas: %.2f\n"
                + "\tTarifa Base: %.2f\n", super.toString(), gb, costoGb, tarifaBase);
        return cadena;
    }

}
