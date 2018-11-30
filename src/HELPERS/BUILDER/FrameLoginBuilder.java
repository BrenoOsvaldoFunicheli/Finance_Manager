/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.BUILDER;

import CONTROLLER.ResearchController;
import CONTROLLER.RoutesController;
import VIEW.JFrameLogin;
import VIEW.Session;
import java.awt.event.ActionEvent;

/**
 *
 * @author osval
 */
public class FrameLoginBuilder {

    private JFrameLogin jfl;

    public FrameLoginBuilder() {
        this.jfl = new JFrameLogin();
    }

    public FrameLoginBuilder evtBtnLogin() {
        jfl.getjBtnLogin().addActionListener((ActionEvent ae) -> {

            if (new ResearchController().findUser(jfl.getFields())) {

                Session session = new Session(new ResearchController().getUser(jfl.getFields()));
                new RoutesController().callMain(session);
                this.jfl.dispose();

            }
        });

        return this;
    }

    public FrameLoginBuilder evtBtnCadastro() {

        jfl.getjBtnCadasro().addActionListener(
                (ActionEvent ae) -> {
                    new RoutesController().callJCadastroUser();
                });

        return this;
    }

    public JFrameLogin builder() {
        return jfl;
    }
}
