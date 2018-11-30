/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.BUILDER;

import CONTROLLER.AlterController;
import CONTROLLER.RoutesController;
import ENTITY.AccountEntity;
import VIEW.JDialogAccount;
import VIEW.Session;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author osval
 */
public class FrameAccountBuilder {

    private JDialogAccount jif;
    private RoutesController rc;

    public FrameAccountBuilder(Session session, AccountEntity ae) {
        this.jif = new JDialogAccount(null, session, ae);
        rc = new RoutesController();
    }

    public JDialogAccount builder() {
        return jif;
    }

    public FrameAccountBuilder btnAdd() {
        limparActions(jif.getjBtnCadastrar());

        jif.getjBtnCadastrar().addActionListener(
                (ActionEvent ae) -> {
                    new AlterController().updateAccount(jif.getFields(), jif.getAe());
                }
        );
        return this;
    }

    private void limparActions(JButton btn) {
        ActionListener[] as = btn.getActionListeners();
        for (int i = 0; as.length > i; i++) {
            btn.removeActionListener(as[i]);
        }
    }

}
