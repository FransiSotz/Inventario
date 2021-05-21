package Controlador;

import Vista.frmCodigoBarra;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Guardar {

        public File guardarPdf() 
        {
        File guardarBarras = null;
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setDialogTitle("Guardar Código de Barras");//Para poner titulo a la ventana Guardar
        FileFilter filter = new FileNameExtensionFilter("Barras Image", "PNG");//Filtro para busqueda de archivos

        fileChooser.addChoosableFileFilter(filter);//aplicando filtro
        int userSelection = fileChooser.showSaveDialog(new frmCodigoBarra());
        if (userSelection == JFileChooser.APPROVE_OPTION) 
        {
            guardarBarras = fileChooser.getSelectedFile();
            if (!guardarBarras.toString().endsWith(".pdf")) 
            {
                guardarBarras = new File(fileChooser.getSelectedFile() + ".pdf");
                System.out.println("Ruta : " + guardarBarras);
            }
        }
        return guardarBarras;
        }
}
