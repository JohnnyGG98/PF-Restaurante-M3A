package controlador.gerente;

import controlador.estilo.EstiloCTR;
import controlador.vtn.CambioPnlCTR;
import vista.contenedores.VtnPrincipal;
import vista.gerente.PlatosPnl;

/**
 *
 * @author Johnny
 */
public class PlatosCTR {

    private final VtnPrincipal vtnPrin;
    private final PlatosPnl pnlPlatos;

    public PlatosCTR(VtnPrincipal vtnPrin, PlatosPnl pnlPlatos) {
        this.vtnPrin = vtnPrin;
        this.pnlPlatos = pnlPlatos;

        CambioPnlCTR.cambioPnl(vtnPrin.getPnlCRUD(), pnlPlatos);
    }

    public void iniciar() {
        EstiloCTR.animacionBtnFondo(pnlPlatos.getBtnEditar(), pnlPlatos.getBtnInformacion(), pnlPlatos.getBtnIngresar(), 
                pnlPlatos.getBtnEliminar());
        EstiloCTR.animacionTxtBorde(pnlPlatos.getTxtBuscar());
        EstiloCTR.estiloTbl(pnlPlatos.getTblPlatos());

    }

}
