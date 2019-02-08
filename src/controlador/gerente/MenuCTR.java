package controlador.gerente;

import controlador.estilo.EstiloCTR;
import controlador.vtn.CambioPnlCTR;
import modelo.estilo.BtnCambioFondo;
import vista.contenedores.VtnPrincipal;
import vista.gerente.MenuPnl;

/**
 *
 * @author Johnny
 */
public class MenuCTR {
    
    private final VtnPrincipal vtnPrin;
    private final MenuPnl pnlMenu;
    
    public MenuCTR(VtnPrincipal vtnPrin, MenuPnl pnlMenu) {
        this.vtnPrin = vtnPrin;
        this.pnlMenu = pnlMenu;
        
        CambioPnlCTR.cambioPnl(vtnPrin.getPnlCRUD(), pnlMenu);
    }
    
    public void iniciar() {
        //Agregamos las animaciones a los btn
        EstiloCTR.animacionBtnFondo(pnlMenu.getBtnEditar(), pnlMenu.getBtnEliminar(),
                pnlMenu.getBtnIngresar(), pnlMenu.getBtnVer());

        //Estilo de la tbl  
        EstiloCTR.estiloTbl(pnlMenu.getTblMenu());
        
        //Animacion txt 
        EstiloCTR.animacionTxtBorde(pnlMenu.getTxtBuscar()); 
    }

    
}
