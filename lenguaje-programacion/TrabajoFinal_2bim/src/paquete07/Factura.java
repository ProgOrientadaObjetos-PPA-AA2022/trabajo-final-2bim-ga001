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

    private String nombres;
    private String cedula;
    private String ciudad;
    private String marca;
    private String modelo;
    private int numero;
    private double pagoMensualTotal;
    private ArrayList<PlanCelular> lista = new ArrayList<>();

    public Factura(String n, String c, String ci, String m, String mo, int nu, double p) {
        nombres = n;
        cedula = c;
        ciudad = ci;
        marca = m;
        modelo = mo;
        numero = nu;
        pagoMensualTotal = p;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerCiudad(String ci) {
        ciudad = ci;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerModelo(String mo) {
        modelo = mo;
    }

    public void establecerNumero(int nu) {
        numero = nu;
    }

    public void establecerLista(ArrayList<PlanCelular> l) {
        lista = l;
    }

    public void establecerPagoMensualTotal(double p) {
        for (PlanCelular plan : lista) {
            pagoMensualTotal += plan.obtenerPagoMensual();
        }
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo() {
        return modelo;
    }

    public int obtenerNumero() {
        return numero;
    }

    public double obtenerPagoMensualTotal() {
        return pagoMensualTotal;
    }

    public ArrayList<PlanCelular> obtenerLista() {
        return lista;
    }
    
}
