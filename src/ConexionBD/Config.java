
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Randall
 */
public class Config {

    static Connection con = null;

    /**
     * Constructor de la clase, se encarga de abrir y configurar la conexion
     *
     */
    public Config() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        abrirConexion();
    }

    /**
     * Método encargado de abrir la conexion a la base de datos.
     *
     */
    public void abrirConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/articulos";
            String usuario = "root";
            String pass = "";
            con = DriverManager.getConnection(servidor, usuario, pass);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            con = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            con = null;
        }
    }

    /**
     * Método encargado de cerrar la conexion co la base de datos.
     *
     */
    public void cerrarConexion() {
        try {
            con.close();
        } catch (SQLException ex) {
            // Mantener el control sobre el tipo de error
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}//Fin de la clase.
