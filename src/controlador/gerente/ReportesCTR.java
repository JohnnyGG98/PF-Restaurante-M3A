package controlador.gerente;

import controlador.estilo.EstiloCTR;
import controlador.vtn.CambioPnlCTR;
import vista.contenedores.VtnPrincipal;
import vista.gerente.ReportesPnl;

/**
 *
 * @author Johnny
 */
public class ReportesCTR {

    private final VtnPrincipal vtnPrin;
    private final ReportesPnl pnlReportes;

    public ReportesCTR(VtnPrincipal vtnPrin, ReportesPnl pnlReportes) {
        this.vtnPrin = vtnPrin;
        this.pnlReportes = pnlReportes;

        CambioPnlCTR.cambioPnl(vtnPrin.getPnlCRUD(), pnlReportes);
    }

    public void iniciar() {
        EstiloCTR.animacionBtnFondo(pnlReportes.getBtnImprimir(), pnlReportes.getBtnInformacion(), pnlReportes.getBtnRealizar());
        EstiloCTR.animacionTxtBorde(pnlReportes.getTxtBuscar());
        EstiloCTR.estiloTbl(pnlReportes.getTblReportes());
    }

}
