
package controlador;

import controlador.gerente.GerenteCTR;
import vista.contenedores.BienvenidaPnl;
import vista.contenedores.VtnPrincipal;
import vista.gerente.GerenteNvPnl;

/**
 *
 * @author Johnny
 */
public class run {
    
    public static void main (String [] args){
        estiloWindows();
        
        BienvenidaPnl pnlBd = new BienvenidaPnl(); 
        GerenteNvPnl pnlNv = new GerenteNvPnl(); 
        VtnPrincipal vtnPrin = new VtnPrincipal(); 
        
        GerenteCTR gr = new GerenteCTR(pnlBd, pnlNv, vtnPrin); 
        
        gr.iniciar();
    }
    
    public static void estiloWindows(){
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
