/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import HELPERS.OBSERVER.TableObserver;
import VIEW.FrameFinancas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author osval
 */
public class FrameTransction {

    private final TableObserver to;
    private final RoutesController rc;

    public FrameTransction() {
        this.rc = new RoutesController();
        this.to = new TableObserver();
    }

    public void toBtnAddHome(FrameFinancas frm) {
        limparActions(frm.getjBtnSalvar());
        frm.getjBtnSalvar().addActionListener(
                (ActionEvent ae) -> {
                    rc.callAccount(frm.getSession());
                    to.notifyHome(frm.getTableDados());
                });
    }

    public void toBtnAddExpense(FrameFinancas frm) {
        limparActions(frm.getjBtnSalvar());
        frm.getjBtnSalvar().addActionListener(
                (ActionEvent ae) -> {
                    rc.callExpense(frm.getSession(), "Cadastrar Despesa");
                    to.notifyExpense(frm.getTableDados(), frm.getjComboConta());
                });
    }

    public void toBtnAddRecipe(FrameFinancas frm) {
        limparActions(frm.getjBtnSalvar());
        frm.getjBtnSalvar().addActionListener(
                (ActionEvent ae) -> {
                    rc.callRecipe(frm.getSession(), "Cadastrar Receita");
                    to.notifyRecipe(frm.getTableDados(), frm.getjComboConta());
                });
    }

    public void toBtnAltHome(FrameFinancas frm) {
        limparActions(frm.getjBtnAlterar());
        frm.getjBtnAlterar().addActionListener(
                (ActionEvent ae) -> {
                    rc.callAccount(frm.getSession(), frm.getTableDados());
                    to.notifyHome(frm.getTableDados());
                });
    }

    private void limparActions(JButton btn) {
        ActionListener[] as = btn.getActionListeners();
        for (int i = 0; as.length > i; i++) {
            btn.removeActionListener(as[i]);
        }
    }

    public void toBtnAltExpense(FrameFinancas frm) {
        limparActions(frm.getjBtnAlterar());
        frm.getjBtnAlterar().addActionListener(
                (ActionEvent ae) -> {
                    rc.callExpense(frm.getSession(), frm.getTableDados(), "Alterar Despesa");
                    to.notifyExpense(frm.getTableDados(), frm.getjComboConta());
                });
    }

    public void toBtnAltRecipe(FrameFinancas frm) {
        limparActions(frm.getjBtnAlterar());
        frm.getjBtnAlterar().addActionListener(
                (ActionEvent ae) -> {
                    rc.callRecipe(frm.getSession(), frm.getTableDados(), "Alterar Receita");
                    to.notifyRecipe(frm.getTableDados(), frm.getjComboConta());
                });
    }

    public void toBtnRemoveRecipe(FrameFinancas frm) {
        limparActions(frm.getjBtnRemover());
        frm.getjBtnRemover().addActionListener(
                (ActionEvent ae) -> {
                    new MessagerController().isRemoveSuccessful(
                            new RemoveController().deleteRecipe(frm.getTableDados()));
                    to.notifyRecipe(frm.getTableDados(), frm.getjComboConta());
                });
    }

    public void toBtnRemoveExpense(FrameFinancas frm) {
        limparActions(frm.getjBtnRemover());
        frm.getjBtnRemover().addActionListener(
                (ActionEvent ae) -> {
                    new MessagerController().isRemoveSuccessful(
                            new RemoveController().deleteExpense(frm.getTableDados()));
                    to.notifyExpense(frm.getTableDados(), frm.getjComboConta());
                });
    }

    public void toBtnSearchRecipe(FrameFinancas frm) {
        limparActions(frm.getJbtnBuscar());
        frm.getJbtnBuscar().addActionListener(
                (ActionEvent ae) -> {
                    System.out.println("s");
                    to.notifyRecipeWithDate(frm);
                });
    }

    public void toBtnSearchExpense(FrameFinancas frm) {
        limparActions(frm.getJbtnBuscar());
        frm.getJbtnBuscar().addActionListener(
                (ActionEvent ae) -> {
                    System.out.println("s");
                    to.notifyExpenseWithDate(frm);
                });
    }

}
