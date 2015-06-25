/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;


import com.itextpdf.text.BaseColor;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

/**
 *
 * @author Randall
 */
public class Imprimir {

    public static final String nombre = "Articulo.pdf";

    /**
     * Método encargado de generar un pdf con parámetro recibido.
     *
     * @param texto cadena que contiene la informacion a guardar.
     */
    public void convertirPDF(StringBuilder texto) {
        try {
            Document documento = new Document(PageSize.LETTER, 20, 20, 20, 20);
            PdfWriter.getInstance(documento, new FileOutputStream(nombre));
            documento.open();
            Paragraph parametro = new Paragraph(texto.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE));
            documento.add(parametro);
            documento.close();
        } catch (FileNotFoundException fe) {
            System.out.println("Error...");
        } catch (DocumentException de) {
            System.out.println("Error...");
        }
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Articulo.pdf");
            System.out.println("Final");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//Fin de la clase.
