package controlador;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.contenedores.BienvenidaPnl;
import vista.contenedores.VtnPrincipal;
import vista.gerente.GerenteNvPnl;

/**
 *
 * @author Johnny
 */
public class run {

    public static void main(String[] args) {
        estiloWindows();

        BienvenidaPnl pnlBd = new BienvenidaPnl();
        GerenteNvPnl pnlNv = new GerenteNvPnl();
        VtnPrincipal vtnPrin = new VtnPrincipal();
        vtnPrin.setVisible(true);

    }

    public static void estiloWindows() {
        try {
            UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo cargar el look al field");
        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(run.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
