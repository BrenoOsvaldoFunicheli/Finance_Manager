/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import HELPERS.FACTORY.AccountFactory;
import HELPERS.FACTORY.ExpenseFactory;
import HELPERS.BUILDER.FrameAccountBuilder;
import HELPERS.BUILDER.FrameItemBuilder;
import HELPERS.BUILDER.FrameLoginBuilder;
import VIEW.JDialogAccount;
import VIEW.JUser;
import VIEW.JDialogCadastroFinanceItem;
import VIEW.JFrameLogin;
import VIEW.JFrameMain;
import VIEW.Session;
import javax.swing.JTable;

/**
 *
 * @author osval
 */
public class RoutesController {

    public void callMain(Session session) {

        JFrameMain jfm = new JFrameMain(session, "FINANCE MANAGER");
        ajustFrame(jfm);
    }

    public void callJCadastroUser() {
        new JUser(null, true).setVisible(true);
    }

    public void callRecipe(Session session, String name) {
        JDialogCadastroFinanceItem jdc = new FrameItemBuilder(session)
                .combo()
                .title(name)
                .BtnSalvarRecipe().builder();

        ajustFrame(jdc);
    }

    public void callExpense(Session session, String name) {
        JDialogCadastroFinanceItem jdc = new FrameItemBuilder(session)
                .combo()
                .title(name)
                .BtnSalvarExpense().builder();

        ajustFrame(jdc);
    }

    public void callAccount(Session session) {
        JDialogAccount jda = new JDialogAccount(session);
        ajustFrame(jda);
    }

    public void callAccount(Session session, JTable table) {
        AccountEntity ae = AccountFactory.createAccount(table, session.getUserEntity());

        JDialogAccount jda = new FrameAccountBuilder(session, ae)
                .btnAdd().builder();

        ajustFrame(jda);
    }

    public void callExpense(Session session, JTable table, String name) {
        ItemFinnanceEntity ife = ExpenseFactory.createExpense(table);

        JDialogCadastroFinanceItem jdcf
                = new FrameItemBuilder(session, ife)
                        .BtnAlterarExpense()
                        .nome(table.getValueAt(table.getSelectedRow(), 0).toString())
                        .descricao(table.getValueAt(table.getSelectedRow(), 1).toString())
                        .quantidade(table.getValueAt(table.getSelectedRow(), 3).toString())
                        .valor(table.getValueAt(table.getSelectedRow(), 2).toString())
                        .combo()
                        .sTitle(name).builder();

        ajustFrame(jdcf);
    }

    public void callRecipe(Session session, JTable table, String name) {
        ItemFinnanceEntity ife = ExpenseFactory.createRecipe(table);

        JDialogCadastroFinanceItem jdcf
                = new FrameItemBuilder(session, ife)
                        .BtnAlterarRecipe()
                        .nome(table.getValueAt(table.getSelectedRow(), 0).toString())
                        .descricao(table.getValueAt(table.getSelectedRow(), 1).toString())
                        .quantidade(table.getValueAt(table.getSelectedRow(), 3).toString())
                        .valor(table.getValueAt(table.getSelectedRow(), 2).toString())
                        .combo()
                        .sTitle(name).builder();

        ajustFrame(jdcf);
    }

    public void callLogin() {
        JFrameLogin jfl = new FrameLoginBuilder()
                .evtBtnLogin()
                .evtBtnCadastro().builder();

        ajustFrame(jfl);
    }

    private void ajustFrame(JFrameMain jfm) {
        jfm.setLocationRelativeTo(null);
        jfm.setVisible(true);
    }

    private void ajustFrame(JDialogAccount jda) {
        jda.setLocationRelativeTo(null);
        jda.setVisible(true);
    }

    private void ajustFrame(JDialogCadastroFinanceItem jdc) {
        jdc.setLocationRelativeTo(null);
        jdc.setVisible(true);
    }

    private void ajustFrame(JFrameLogin jfl) {
        jfl.setLocationRelativeTo(null);
        jfl.setVisible(true);
    }

}
