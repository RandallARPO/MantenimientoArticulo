/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Randall
 */
public class Articulo {

    private int ID;
    private String upceanisbn;
    private String categoria;
    private double costo;
    private float impuesto_1;
    private int cantidad;
    private String localizacion;
    private String descripcion;
    private String nombre;
    private String proveedor;
    private double precio_unitario;
    private float impuesto_2;
    private int reordenamiento;
    private String descripcion_alterna;
    private String numero_serie;

    /**
     * Constructor vacío de la clase.
     *
     */
    public Articulo() {
    }

    /**
     * Constructor con parámetros de la clase.
     *
     */
    public Articulo(int ID, String upceanisbn, String categoria, double costo, float impuesto_1, int cantidad, String localizacion, String descripcion, String nombre, String proveedor, double precio_unitario, float impuesto_2, int reordenamiento, String descripcion_alterna) {
        this.ID = ID;
        this.upceanisbn = upceanisbn;
        this.categoria = categoria;
        this.costo = costo;
        this.impuesto_1 = impuesto_1;
        this.cantidad = cantidad;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio_unitario = precio_unitario;
        this.impuesto_2 = impuesto_2;
        this.reordenamiento = reordenamiento;
        this.descripcion_alterna = descripcion_alterna;
    }

    /**
     * @return the numero_serie
     */
    public String getNumero_serie() {
        return numero_serie;
    }

    
    /**
     * @param numero_serie the numero_serie to set
     */
    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the upceanisbn
     */
    public String getUpceanisbn() {
        return upceanisbn;
    }

    /**
     * @param upceanisbn the upceanisbn to set
     */
    public void setUpceanisbn(String upceanisbn) {
        this.upceanisbn = upceanisbn;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the impuesto_1
     */
    public float getImpuesto_1() {
        return impuesto_1;
    }

    /**
     * @param impuesto_1 the impuesto_1 to set
     */
    public void setImpuesto_1(float impuesto_1) {
        this.impuesto_1 = impuesto_1;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the localizacion
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * @param localizacion the localizacion to set
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the proveedor
     */
    public String getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the precio_unitario
     */
    public double getPrecio_unitario() {
        return precio_unitario;
    }

    /**
     * @param precio_unitario the precio_unitario to set
     */
    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    /**
     * @return the impuesto_2
     */
    public float getImpuesto_2() {
        return impuesto_2;
    }

    /**
     * @param impuesto_2 the impuesto_2 to set
     */
    public void setImpuesto_2(float impuesto_2) {
        this.impuesto_2 = impuesto_2;
    }

    /**
     * @return the reordenamiento
     */
    public int getReordenamiento() {
        return reordenamiento;
    }

    /**
     * @param reordenamiento the reordenamiento to set
     */
    public void setReordenamiento(int reordenamiento) {
        this.reordenamiento = reordenamiento;
    }

    /**
     * @return the descripcion_alterna
     */
    public String getDescripcion_alterna() {
        return descripcion_alterna;
    }

    /**
     * @param descripcion_alterna the descripcion_alterna to set
     */
    public void setDescripcion_alterna(String descripcion_alterna) {
        this.descripcion_alterna = descripcion_alterna;
    }

    @Override
    public String toString() {
        return "Articulo{" + "ID=" + ID + ", upceanisbn=" + upceanisbn + ", categoria=" + categoria + ", costo=" + costo + ", impuesto_1=" + impuesto_1 + ", cantidad=" + cantidad + ", localizacion=" + localizacion + ", descripcion=" + descripcion + ", nombre=" + nombre + ", proveedor=" + proveedor + ", precio_unitario=" + precio_unitario + ", impuesto_2=" + impuesto_2 + ", reordenamiento=" + reordenamiento + ", descripcion_alterna=" + descripcion_alterna + ", numero_serie=" + numero_serie + '}';
    }  
}//Fin de la clase.
