/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import ConexionBD.Conexion_Articulo;
import Interfaz_Mensajes.InterfaceMensajes;
import Objetos.Articulo;

/**
 *
 * @author Randall
 */
public class logica_Articulo {

    private boolean continuar = true;
    Conexion_Articulo conexion = new Conexion_Articulo();
    InterfaceMensajes interfazmsg = new InterfaceMensajes();

    /**
     * Constructor vacío de la clase.
     *
     */
    public logica_Articulo() {

    }

    /**
     * Método encargado de insertar un objeto artículo a la base de datos.
     *
     * @param articulo objeto a ser insertado en la base de datos.
     */
    public void insertarArticulo(Articulo articulo) {
        conexion.insertarArticulo(articulo);
        interfazmsg.mostrarMensajeExito("Artículo almacenado con éxito");
    }

    /**
     * Método encargado de buscar un objeto artículo en la base de datos.
     *
     * @param articulo objeto por buscar en la base de datos.
     * @return articulo objeto articulo a ser devuelto.
     */
    public Articulo buscarArticulo(Articulo articulo) {
        Articulo nuevo;
        nuevo = conexion.buscarArticulo(articulo);
        if (nuevo.getProveedor() == null) {
            interfazmsg.mostrarMensajeError("El artículo ingresado para la búsqueda no existe");
            this.continuar = false;
        } else {
            interfazmsg.mostrarMensajeExito("El artículo va a ser mostrado \n con todos los datos almacenados actualmente");
        }
        return nuevo;
    }

    /**
     * Método encargado de modificar un objeto artículo en la base de datos.
     *
     * @param articulo objeto a ser modificado en la base de datos.
     */
    public void modificarArticulo(int id, Articulo articulo) {
        conexion.modificarArticulo(id, articulo);
        interfazmsg.mostrarMensajeExito("Artículo Editado con éxito");
    }

    /**
     * Método encargado de eliminar un objeto artículo de la base de datos.
     *
     * @param id indice a ser eliminado de la base de datos.
     */
    public void eliminarArticulo(int id) {
        conexion.eliminarArticulo(id);
        interfazmsg.mostrarMensajeExito("Artículo Eliminado con éxito");
    }

    /**
     * Método encargado de dar aviso si se puede continuar con el proceso.
     *
     */
    public boolean continuar() {
        return this.continuar;
    }
}//Fin de la clase.
