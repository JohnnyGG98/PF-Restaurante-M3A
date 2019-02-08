package controlador.gerente;

import controlador.estilo.EstiloCTR;
import controlador.vtn.CambioPnlCTR;
import vista.contenedores.VtnPrincipal;
import vista.gerente.ContratosPnl;

/**
 *
 * @author Johnny
 */
public class ContratoCTR {

    private final VtnPrincipal vtnPrin;
    private final ContratosPnl pnlContrato;

    public ContratoCTR(VtnPrincipal vtnPrin, ContratosPnl pnlContrato) {
        this.vtnPrin = vtnPrin;
        this.pnlContrato = pnlContrato;

        CambioPnlCTR.cambioPnl(vtnPrin.getPnlCRUD(), pnlContrato);
    }

    public void iniciar() {
        EstiloCTR.animacionBtnFondo(pnlContrato.getBtnEditar(), pnlContrato.getBtnInformacion(), pnlContrato.getBtnIngresar(),
               pnlContrato.getBtnTerminar());
        EstiloCTR.animacionTxtBorde(pnlContrato.getTxtBuscar());
        EstiloCTR.estiloTbl(pnlContrato.getTblContratos());

    }

}
