/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Mensajes;

import javax.swing.JOptionPane;

/**
 *
 * @author Randall
 */
public class InterfaceMensajes {

    /**
     * Constructor vacío de la clase.
     *
     */
    public InterfaceMensajes() {

    }

    /**
     * Método que muestra mensajes de error.
     *
     * @param mensaje mensaje a mostrar.
     */
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "ERROR",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Método que muestra mensajes de advertencia.
     *
     * @param mensaje mensaje a mostrar.
     */
    public void mostrarMensajeAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "ADVERTENCIA",
                JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Método que muestra mensajes de exito.
     *
     * @param mensaje mensaje a mostrar.
     */
    public void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Exito",
                JOptionPane.INFORMATION_MESSAGE);
    }
}//Fin de la clase
