package controlador.estilo;

import javax.swing.JButton;
import javax.swing.JTable;
import modelo.estilo.BtnCambioFondo;
import modelo.estilo.BtnCambioLetra;
import modelo.estilo.TblEstilo;

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

    public static void animacionBtnFondo(JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
        btn1.addMouseListener(new BtnCambioFondo(btn1));
        btn2.addMouseListener(new BtnCambioFondo(btn2));
        btn3.addMouseListener(new BtnCambioFondo(btn3));
        btn4.addMouseListener(new BtnCambioFondo(btn4));
    }

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

}
