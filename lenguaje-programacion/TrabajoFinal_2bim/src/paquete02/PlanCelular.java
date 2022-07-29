/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author josed
 */
public abstract class PlanCelular {

    protected String nombresPropietario;
    protected String cedulaPropietario;
    protected String ciudadPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected String numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String n, String c, String ciu, String marC,
            String moC, String nc) {
        nombresPropietario = n;
        cedulaPropietario = c;
        ciudadPropietario = ciu;
        marcaCelular = marC;
        modeloCelular = moC;
        numeroCelular = nc;
    }

    public void establecerNombres(String n) {
        nombresPropietario = n;
    }

    public void establecerCedula(String c) {
        cedulaPropietario = c;
    }

    public void establecerCiudad(String ciu) {
        ciudadPropietario = ciu;
    }

    public void establecerMarcaCelular(String marC) {
        marcaCelular = marC;
    }

    public void establecerModeloCeular(String moC) {
        modeloCelular = moC;
    }

    public void establecerNumeroCelular(String nc) {
        numeroCelular = nc;
    }

    public abstract void establecerPagoMensual();

    public String obtenerNombre() {
        return nombresPropietario;
    }

    public String obtenerCedula() {
        return cedulaPropietario;
    }

    public String obtenerCiudad() {
        return ciudadPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("------DATOS DEL PROPIETARIO------\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Marca del celular: %s\n"
                + "Modelo del celular: %s\n"
                + "Numero de celular: %s\n"
                + "Pago Mensual: %.2f\n", nombresPropietario, cedulaPropietario,
                ciudadPropietario, marcaCelular, modeloCelular, numeroCelular,
                pagoMensual);
        return cadena;
    }
}
