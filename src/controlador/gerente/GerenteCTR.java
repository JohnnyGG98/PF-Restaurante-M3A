package controlador.gerente;

import controlador.estilo.EstiloCTR;
import controlador.vtn.CambioPnlCTR;
import vista.contenedores.BienvenidaPnl;
import vista.contenedores.VtnPrincipal;
import vista.gerente.ContratosPnl;
import vista.gerente.GerenteNvPnl;
import vista.gerente.MenuPnl;
import vista.gerente.PagosPnl;
import vista.gerente.PlatosPnl;
import vista.gerente.ReportesPnl;

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
        CambioPnlCTR.cambioPnl(vtnPrin.getPnlNavegacion(), pnlNv);
        CambioPnlCTR.cambioPnl(vtnPrin.getPnlCRUD(), pnlBd);

        //Mostramos la ventana 
        vtnPrin.setVisible(true);
    }

    public void iniciar() {
        //Agregamos las animaciones a los btns de navegacion 
        EstiloCTR.animacionBtnLetra(pnlNv.getBtnContratos(), pnlNv.getBtnMenu(),
                pnlNv.getBtnPagos(), pnlNv.getBtnPlatos(), pnlNv.getBtnReportes());

        pnlBd.getLblNombre().setText("Gerente maestro");
        vtnPrin.getLblNombre().setText("AUS");

        //Asignamos las acciones a los botones 
        vtnPrin.getBtnSalir().addActionListener(e -> clickSalir());

        pnlNv.getBtnContratos().addActionListener(e -> clickContrato());
        pnlNv.getBtnMenu().addActionListener(e_ -> clickMenu());
        pnlNv.getBtnPagos().addActionListener(e -> clickPagos());
        pnlNv.getBtnPlatos().addActionListener(e -> clickPlatos());
        pnlNv.getBtnReportes().addActionListener(e -> clickReportes());
    }

    public void clickContrato() {
        ContratosPnl pnlContrato = new ContratosPnl();
        ContratoCTR ctrContrato = new ContratoCTR(vtnPrin, pnlContrato);
        ctrContrato.iniciar();

        EstiloCTR.estadoBtnNv(pnlNv.getBtnContratos(), pnlNv.getBtnMenu(), pnlNv.getBtnPagos(),
                pnlNv.getBtnPlatos(), pnlNv.getBtnReportes());
    }

    public void clickMenu() {
        MenuPnl pnlMenu = new MenuPnl();
        MenuCTR ctrMenu = new MenuCTR(vtnPrin, pnlMenu);

        ctrMenu.iniciar();

        EstiloCTR.estadoBtnNv(pnlNv.getBtnMenu(), pnlNv.getBtnContratos(), pnlNv.getBtnPagos(),
                pnlNv.getBtnPlatos(), pnlNv.getBtnReportes());
    }

    public void clickPagos() {
        PagosPnl pnlPagos = new PagosPnl();
        PagosCTR ctrPagos = new PagosCTR(vtnPrin, pnlPagos);

        ctrPagos.iniciar();

        EstiloCTR.estadoBtnNv(pnlNv.getBtnPagos(), pnlNv.getBtnMenu(), pnlNv.getBtnContratos(),
                pnlNv.getBtnPlatos(), pnlNv.getBtnReportes());
    }

    public void clickPlatos() {
        PlatosPnl pnlPagos = new PlatosPnl();
        PlatosCTR ctrPlatos = new PlatosCTR(vtnPrin, pnlPagos);

        ctrPlatos.iniciar();

        EstiloCTR.estadoBtnNv(pnlNv.getBtnPlatos(), pnlNv.getBtnPagos(), pnlNv.getBtnMenu(),
                pnlNv.getBtnContratos(), pnlNv.getBtnReportes());
    }

    public void clickReportes() {
        ReportesPnl pnlReportes = new ReportesPnl();
        ReportesCTR ctrReportes = new ReportesCTR(vtnPrin, pnlReportes);

        ctrReportes.iniciar();

        EstiloCTR.estadoBtnNv(pnlNv.getBtnReportes(), pnlNv.getBtnPlatos(), pnlNv.getBtnPagos(),
                pnlNv.getBtnMenu(), pnlNv.getBtnContratos());
    }

    public void clickSalir() {
        System.exit(0);
    }

}
