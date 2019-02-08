package controlador.gerente;

import controlador.estilo.EstiloCTR;
import controlador.vtn.CambioPnlCTR;
import vista.contenedores.VtnPrincipal;
import vista.gerente.PagosPnl;

/**
 *
 * @author Johnny
 */
public class PagosCTR {

    private final VtnPrincipal vtnPrin;
    private final PagosPnl pnlPagos;

    public PagosCTR(VtnPrincipal vtnPrin, PagosPnl pnlPagos) {
        this.vtnPrin = vtnPrin;
        this.pnlPagos = pnlPagos;

        CambioPnlCTR.cambioPnl(vtnPrin.getPnlCRUD(), pnlPagos);
    }

    public void iniciar() {
        EstiloCTR.animacionBtnFondo(pnlPagos.getBtnInformacion(), pnlPagos.getBtnIngresar());
        EstiloCTR.animacionTxtBorde(pnlPagos.getTxtBuscar());
        EstiloCTR.estiloTbl(pnlPagos.getTblPagos());

    }

}
