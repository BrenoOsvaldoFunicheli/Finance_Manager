/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.BUILDER;

import CONTROLLER.RoutesController;
import VIEW.FrameFinancas;
import VIEW.Session;

/**
 *
 * @author osval
 */
public class FrameHomeBuilder {

    private final FrameFinancas jif;
    private RoutesController rc;
    
    public FrameHomeBuilder(Session session) {
        this.jif = new FrameFinancas(session);
        rc = new RoutesController();
    }

    public FrameFinancas builder() {
        return jif;
    }

    public FrameHomeBuilder BtnAdd() {
        jif.getjBtnSalvar().addActionListener(
                (ae) -> {
                    rc.callAccount(jif.getSession());
                }
        );

        return this;
    }

}
