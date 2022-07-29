/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.PlanCelular;

/**
 *
 * @author josed
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/base001.base";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarCalificaciones(Factura plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO Planes (nombres, "
                    + "cedula, ciudad, marca, modelo, numero, pago mensual) "
                    + "values ('%s', '%s', '%s', '%s', '%s', '%d', '%.2f')",
                    plan.obtenerNombres(),
                    plan.obtenerCedula(),
                    plan.obtenerCiudad(),
                    plan.obtenerMarca(),
                    plan.obtenerModelo(),
                    plan.obtenerNumero(),
                    plan.obtenerPagoMensualTotal());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanes");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Factura> obtenerDataCelular() {
        ArrayList<Factura> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Factura;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Factura fact = new Factura(
                        rs.getString("nombre"),
                        rs.getString("cedula"),
                        rs.getString("ciudad"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("numero"),
                        rs.getDouble("pago mensual"));
                lista.add(fact);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarFactura");
            System.out.println(e.getMessage());

        }
        return lista;
    }
}
