/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import HELPERS.OBSERVER.TableObserver;
import Manager.ComboItemManager;
import Manager.TableManager;
import VIEW.FrameFinancas;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author osval
 */
public class AdjustController {

    private final TableObserver to;
    private final FrameTransction ft;

    public AdjustController() {
        this.to = new TableObserver();
        this.ft = new FrameTransction();
    }

    @SuppressWarnings("unchecked")
    public void ajustHome(JDesktopPane aba, FrameFinancas frm, String title) {
        ajustComponent(aba, frm, false, title);
        isUp(frm);
        to.notifyHome(frm.getTableDados());
        ajustActionsHome(frm);
    }

    public void recipeAjust(JDesktopPane aba, FrameFinancas frm, String title) {
        ajustComponent(aba, frm, true, title);
        to.notifyRecipe(frm.getTableDados(), frm.getjComboConta());
        ajustActionsRecipe(frm);
        ajustTotal(frm);
    }

    public void expenseAjust(JDesktopPane aba, FrameFinancas frm, String title) {
        ajustComponent(aba, frm, true, title);
        to.notifyExpense(frm.getTableDados(), frm.getjComboConta());
        ajustActionsExpense(frm);
        ajustTotal(frm);
    }

    private void ajustConfig(FrameFinancas frm) {
        frm.setVisible(true);
        try {
            frm.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(AdjustController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ajustComponent(JDesktopPane aba, FrameFinancas frm, boolean b, String title) {

        aba.add(frm);
        frm.setTitle(title);
        
        frm.getTotal().setVisible(b);
        frm.getjLabelDataFinal1().setVisible(b);
        frm.getjDataFinalWithCombo().setVisible(b);
        frm.getjDataInicialWithCombo().setVisible(b);
        frm.getjLabelDataInicial().setVisible(b);
        frm.getjLabelDataFinal().setVisible(b);
        frm.getJbtnBuscar().setVisible(b);
        frm.getjComboConta().setVisible(b);
        frm.getjLabelCOnta().setVisible(b);
    }

    private void ajustActionsHome(FrameFinancas frm) {
        ft.toBtnAddHome(frm);
        ft.toBtnAltHome(frm);
    }

    private void ajustActionsExpense(FrameFinancas frm) {
        ft.toBtnAddExpense(frm);
        ft.toBtnAltExpense(frm);
        ft.toBtnRemoveExpense(frm);
        ft.toBtnSearchExpense(frm);
    }

    private void ajustActionsRecipe(FrameFinancas frm) {
        ft.toBtnAddRecipe(frm);
        ft.toBtnAltRecipe(frm);
        ft.toBtnRemoveRecipe(frm);
        ft.toBtnSearchRecipe(frm);
    }

    private void isUp(FrameFinancas frm) {
        if (!FrameFinancas.isUp()) {
            ajustConfig(frm);
            frm.getjComboConta().setModel(new ComboItemManager().getAccounts(frm.getSession()));
            FrameFinancas.setUp(true);
        }
    }

    private void ajustTotal(FrameFinancas frm) {
        frm.getTotal().setText(String.valueOf(new TableManager().getTotal(frm)));
    }

    

}
