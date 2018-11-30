/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.OBSERVER;

import Manager.TableManager;
import VIEW.FrameFinancas;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author osval
 */
public class TableObserver {

    public void notify(JTable frm) {
        new TableManager().updateTableHome(frm);
    }

    public void notifyHome(JTable table) {
        new TableManager().updateTableHome(table);
    }

    public void notifyRecipe(JTable table, JComboBox<String> combo) {
        new TableManager().updateTableRecipe(table, combo);
    }

    public void notifyExpense(JTable table, JComboBox<String> combo) {
        new TableManager().updateTableExpense(table, combo);
    }

    public void notifyExpenseWithDate(FrameFinancas frm) {
         new TableManager().updateTableExpense(frm.getTableDados(), frm.getjComboConta(), frm.getjDataInicial(), frm.getjDataFinal());
    }

    public void notifyRecipeWithDate(FrameFinancas frm) {
        new TableManager().updateTableRecipe(frm.getTableDados(), frm.getjComboConta(), frm.getjDataInicial(), frm.getjDataFinal());
    }
}
