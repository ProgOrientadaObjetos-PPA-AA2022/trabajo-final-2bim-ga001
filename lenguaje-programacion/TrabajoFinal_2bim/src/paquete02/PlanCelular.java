/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

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
    protected int numeroCelular;
    protected double pagoMensual;
    protected ArrayList<PlanCelular> lista = new ArrayList<>();

    public PlanCelular(String n, String c, String ciu, String marC,
            String moC, int nc) {
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

    public void establecerNumeroCelular(int nc) {
        numeroCelular = nc;
    }

    public void establecerLista(ArrayList<PlanCelular> l) {
        lista = l;
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

    public String ModeloCelular() {
        return modeloCelular;
    }

    public int obtenerNumeroCelular() {
        return numeroCelular;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public ArrayList<PlanCelular> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = String.format("------DATOS DEL PROPIETARIO------\n"
                + "Nombre: %s\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Marca del celular: %s\n"
                + "Modelo del celular: %s\n"
                + "Numero de celular: %d\n"
                + "Pago Mensual: %.2f\n", nombresPropietario, cedulaPropietario,
                ciudadPropietario, marcaCelular, modeloCelular, numeroCelular,
                pagoMensual);

        for (PlanCelular p : lista) {
            cadena += p.toString();
        }
        return cadena;
    }
}
