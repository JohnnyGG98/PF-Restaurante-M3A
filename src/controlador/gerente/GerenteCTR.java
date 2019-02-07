package controlador.gerente;

import controlador.estilo.EstiloCTR;
import controlador.vtn.CambioPnlCTR;
import modelo.estilo.BtnCambioLetra;
import vista.contenedores.BienvenidaPnl;
import vista.contenedores.VtnPrincipal;
import vista.gerente.GerenteNvPnl;
import vista.gerente.MenuPnl;

/**
 *
 * @author Johnny
 */
public class GerenteCTR {
    
    private final BienvenidaPnl pnlBd;    
    private final GerenteNvPnl pnlNv;    
    private final VtnPrincipal vtnPrin;
    
    public GerenteCTR(BienvenidaPnl pnlBd, GerenteNvPnl pnlNv, VtnPrincipal vtnPrin) {
        this.pnlBd = pnlBd;        
        this.pnlNv = pnlNv;        
        this.vtnPrin = vtnPrin;
        //Repintamos los paneles con sus paneles correspondientes
        CambioPnlCTR.cambioPnl(vtnPrin.getPnlCRUD(), pnlBd);
        CambioPnlCTR.cambioPnl(vtnPrin.getPnlNavegacion(), pnlNv);

        //Mostramos la ventana 
        vtnPrin.setVisible(true);
    }
    
    public void iniciar() {
        //Agregamos las animaciones a los btns de navegacion 
        EstiloCTR.animacionBtnLetra(pnlNv.getBtnContratos(), pnlNv.getBtnMenu(),
                pnlNv.getBtnPagos(), pnlNv.getBtnPlatos(), pnlNv.getBtnReportes());
        
        pnlBd.getLblNombre().setText("Gerente maestro");        
        vtnPrin.getLblNombre().setText("AUS");        
        
        pnlNv.getBtnMenu().addActionListener(e_ -> clickMenu());
    }
    
    public void clickMenu() {
        MenuPnl pnlMenu = new MenuPnl();        
        MenuCTR menu = new MenuCTR(vtnPrin, pnlMenu);        
        
        menu.iniciar();
    }
    
}
