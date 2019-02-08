package controlador.estilo;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.estilo.BtnCambioFondo;
import modelo.estilo.BtnCambioLetra;
import modelo.estilo.TblEstilo;
import modelo.estilo.TxtFocus;

/**
 *
 * @author Johnny
 */
public class EstiloCTR {

    public static void estiloTbl(JTable tbl) {
        TblEstilo.letrasTbl(tbl);
        TblEstilo.ocualtarID(tbl);
        TblEstilo.titutloTbl(tbl);
    }

    //Animacion del fondo de un boton  cambia de color
    //Al pasar el mouse por arriba  
    public static void animacionBtnFondo(JButton btn1) {
        btn1.addMouseListener(new BtnCambioFondo(btn1));
    }

    public static void animacionBtnFondo(JButton btn1, JButton btn2) {
        btn1.addMouseListener(new BtnCambioFondo(btn1));
        btn2.addMouseListener(new BtnCambioFondo(btn2));
    }

    public static void animacionBtnFondo(JButton btn1, JButton btn2, JButton btn3) {
        btn1.addMouseListener(new BtnCambioFondo(btn1));
        btn2.addMouseListener(new BtnCambioFondo(btn2));
        btn3.addMouseListener(new BtnCambioFondo(btn3));
    }

    public static void animacionBtnFondo(JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
        btn1.addMouseListener(new BtnCambioFondo(btn1));
        btn2.addMouseListener(new BtnCambioFondo(btn2));
        btn3.addMouseListener(new BtnCambioFondo(btn3));
        btn4.addMouseListener(new BtnCambioFondo(btn4));
    }

    //Animacion del color y tamaño de letra de un boton al pasar el mouse
    public static void animacionBtnLetra(JButton btn1, JButton btn2) {
        btn1.addMouseListener(new BtnCambioLetra(btn1));
        btn2.addMouseListener(new BtnCambioLetra(btn2));
    }

    public static void animacionBtnLetra(JButton btn1, JButton btn2, JButton btn3) {
        btn1.addMouseListener(new BtnCambioLetra(btn1));
        btn2.addMouseListener(new BtnCambioLetra(btn2));
        btn3.addMouseListener(new BtnCambioLetra(btn3));
    }

    public static void animacionBtnLetra(JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
        btn1.addMouseListener(new BtnCambioLetra(btn1));
        btn2.addMouseListener(new BtnCambioLetra(btn2));
        btn3.addMouseListener(new BtnCambioLetra(btn3));
        btn4.addMouseListener(new BtnCambioLetra(btn4));
    }

    public static void animacionBtnLetra(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5) {
        btn1.addMouseListener(new BtnCambioLetra(btn1));
        btn2.addMouseListener(new BtnCambioLetra(btn2));
        btn3.addMouseListener(new BtnCambioLetra(btn3));
        btn4.addMouseListener(new BtnCambioLetra(btn4));
        btn5.addMouseListener(new BtnCambioLetra(btn5));
    }

    //Animacion de los txt al ganar focus el color de borde cambiar
    public static void animacionTxtBorde(JTextField txt) {
        txt.addFocusListener(new TxtFocus(txt));
    }

    //Animacion al dar click a un boton de navegacion, el primer boton enviado 
    //Sera el que esta seleccionado
    public static void estadoBtnNv(JButton btnSeleccionado) {
        btnSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
    }

    public static void estadoBtnNv(JButton btnSeleccionado, JButton btn1) {
        btnSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
    }

    public static void estadoBtnNv(JButton btnSeleccionado, JButton btn1, JButton btn2) {
        btnSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
    }

    public static void estadoBtnNv(JButton btnSeleccionado, JButton btn1, JButton btn2, JButton btn3) {
        btnSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
    }

    public static void estadoBtnNv(JButton btnSeleccionado, JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
        btnSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
    }

    public static void estadoBtnNv(JButton btnSeleccionado, JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5) {
        btnSeleccionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 99, 130)));
    }

}
