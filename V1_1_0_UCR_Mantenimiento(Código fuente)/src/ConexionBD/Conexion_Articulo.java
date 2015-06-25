/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import Objetos.Articulo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Randll
 */
public class Conexion_Articulo {

    private Statement cmd;
    Config conexion = new Config();

    /*
     * Método encargado de generar la conexión a la base de datos
     * 
     */
    public Conexion_Articulo() {
        conexion.abrirConexion();
        try {
            this.cmd = Config.con.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

    /**
     * Método encargado de insertar un objeto artículo a la base de datos.
     *
     * @param articulo objeto a ser insertado en la base de datos.
     */
    public void insertarArticulo(Articulo articulo) {
        try {
            this.cmd.execute("INSERT INTO `articulos`.`articulo` (`upceanisbn`, `categoria`, `costo`, `impuesto_1`, `cantidad`, `localizacion`, `descripcion`, `nombre`, `proveedor`, `precio_unitario`, `impuesto_2`, `reordenamiento`, `descripcion_alterna`, `numero_serie`) values('" + articulo.getUpceanisbn() + "','" + articulo.getCategoria() + "','" + articulo.getCosto() + "','" + articulo.getImpuesto_1() + "','" + articulo.getCantidad() + "','" + articulo.getLocalizacion() + "','" + articulo.getDescripcion() + "','" + articulo.getNombre() + "','" + articulo.getProveedor() + "','" + articulo.getPrecio_unitario() + "','" + articulo.getImpuesto_2() + "','" + articulo.getReordenamiento() + "','" + articulo.getDescripcion_alterna() + "','" + articulo.getNumero_serie() + "')");
        } catch (Exception ex) {
            System.err.print("Error al insertar" + ex.getMessage());
        }
    }

    /**
     * Método encargado de buscar un objeto artículo en la base de datos.
     *
     * @param articulo objeto por buscar en la base de datos.
     */
    public Articulo buscarArticulo(Articulo articulo) {
        Articulo articuloResultado = new Articulo();
        try {
            ResultSet rs;
            rs = this.cmd.executeQuery("SELECT * FROM `articulo` WHERE categoria =" + "" + articulo.getCategoria() + " AND " + "nombre=" + "'" + articulo.getNombre() + "'");
            while (rs.next()) {
                articuloResultado.setID(rs.getInt(1));
                articuloResultado.setUpceanisbn(rs.getString("upceanisbn"));
                articuloResultado.setCategoria(rs.getString("categoria"));
                articuloResultado.setCosto(rs.getDouble(4));
                articuloResultado.setImpuesto_1(rs.getFloat(5));
                articuloResultado.setCantidad(rs.getInt(6));
                articuloResultado.setLocalizacion(rs.getString("localizacion"));
                articuloResultado.setDescripcion(rs.getString("descripcion"));
                articuloResultado.setNombre(rs.getString("nombre"));
                articuloResultado.setProveedor(rs.getString("proveedor"));
                articuloResultado.setPrecio_unitario(rs.getDouble(11));
                articuloResultado.setImpuesto_2(rs.getFloat(12));
                articuloResultado.setReordenamiento(rs.getInt(13));
                articuloResultado.setDescripcion_alterna(rs.getString("descripcion_alterna"));
                articuloResultado.setNumero_serie(rs.getString("numero_serie"));
            }
        } catch (Exception ex) {
            System.err.print("Error al buscar " + ex.getMessage());
        }
        return articuloResultado;
    }

    /**
     * Método encargado de modificar un objeto artículo en la base de datos.
     *
     * @param articulo objeto a ser modificado en la base de datos.
     */
    public void modificarArticulo(int id, Articulo articulo) {
        try {
            this.cmd.execute("UPDATE `articulos`.`articulo` SET `upceanisbn`='" + articulo.getUpceanisbn() + "', `categoria`='" + articulo.getCategoria() + "', `costo`='" + articulo.getCosto() + "', `impuesto_1`='" + articulo.getImpuesto_1() + "', `cantidad`='" + articulo.getCantidad() + "', `localizacion`='" + articulo.getLocalizacion() + "', `descripcion`='" + articulo.getDescripcion() + "', `nombre`='" + articulo.getNombre() + "', `proveedor`='" + articulo.getProveedor() + "', `precio_unitario`='" + articulo.getPrecio_unitario() + "', `impuesto_2`='" + articulo.getImpuesto_2() + "', `reordenamiento`='" + articulo.getReordenamiento() + "', `descripcion_alterna`='" + articulo.getDescripcion_alterna() + "', `numero_serie`='" + articulo.getNumero_serie() + "' WHERE `articulo`.`ID`=" + id);
        } catch (Exception ex) {
            System.err.print("Error al Modificar" + ex.getMessage());
        }
    }

    /**
     * Método encargado de eliminar un objeto artículo de la base de datos.
     *
     * @param id indice a ser eliminado de la base de datos.
     */
    public void eliminarArticulo(int id) {
        try {
            this.cmd.execute("DELETE  FROM `articulos`.`articulo` WHERE `articulo`.`ID`=" + id);
        } catch (Exception ex) {
            System.err.print("Error al Eliminar " + ex.getMessage());
        }
    }
}//Fin de la clase.
