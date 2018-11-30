/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import CONTROLLER.ResearchController;
import DAO.AccountDAO;
import DAO.ExpenseDAO;
import DAO.RecipeDAO;
import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import HELPERS.CalculadoraFinanceira;
import VIEW.FrameFinancas;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author osval
 */
public class TableManager {

    public void updateTableRecipe(JTable tableData, JComboBox<String> jComboConta) {

        AccountEntity ae = new AccountDAO().getAccountByName(jComboConta.getSelectedItem().toString());
        List<ItemFinnanceEntity> life = new RecipeDAO().getAllWithUser(ae);
        tableData.setModel(getGenericTable());
        fillTable((DefaultTableModel) tableData.getModel(), life);

    }

    public void updateTableExpense(JTable tableData, JComboBox<String> jComboConta) {

        AccountEntity ae = new AccountDAO().getAccountByName(jComboConta.getSelectedItem().toString());
        List<ItemFinnanceEntity> life = new ExpenseDAO().getAllWithUser(ae);
        tableData.setModel(getGenericTable());
        fillTable((DefaultTableModel) tableData.getModel(), life);

    }

    private DefaultTableModel cleanTable(JTable tableData) {

        DefaultTableModel dtm = (DefaultTableModel) tableData.getModel();
        dtm.getDataVector().removeAllElements();

        return dtm;
    }

    private void fillTable(DefaultTableModel dtm, List<ItemFinnanceEntity> life) {

        for (int i = 0; life.size() > i; i++) {
            dtm.addRow(new Object[]{
                life.get(i).getNameItem(),
                life.get(i).getDescrib(),
                life.get(i).getValueItem(),
                life.get(i).getQuantity(),
                life.get(i).getDateItem()}
            );
        }
    }

    public void updateTableHome(JTable tableData) {
        try {
            List<AccountEntity> lae = new ResearchController().getAllAccount();
            fillTable(lae, tableData);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private DefaultTableModel getTableHome() {
        return new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nome", "Descrição", "Valor", "Quantidade"
                }) {
            private static final long serialVersionUID = 1L;
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }

    private DefaultTableModel getGenericTable() {
        return new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nome", "Descrição", "Valor", "Quantidade", "Data"
                }) {
            private static final long serialVersionUID = 1L;
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }

    private void fillTable(List<AccountEntity> lae, JTable tableData) {
        DefaultTableModel dtm = getTableHome();

        for (int i = 0; lae.size() > i; i++) {
            dtm.addRow(new Object[]{
                lae.get(i).getNameAccount(),
                lae.get(i).getTipoAccount(),
                new CalculadoraFinanceira().calcularTotal(lae.get(i)).toString(),
                lae.get(i).getFgAtivo()});
        }
        tableData.setModel(dtm);
    }

    public float getTotal(FrameFinancas frm) {
        float total = 0;
        JTable t = frm.getTableDados();
        for (int i = 0; t.getRowCount() > i; i++) {
            total += Double.parseDouble(t.getValueAt(i, 2).toString());
        }
        return total;
    }

    public void updateTableRecipe(JTable tableData, JComboBox<String> jComboConta, String dataInicial, String dataFinal) {
        AccountEntity ae = new AccountDAO().getAccountByName(jComboConta.getSelectedItem().toString());
        List<ItemFinnanceEntity> life = new RecipeDAO().getAllRecipeWithDate(ae, dataInicial, dataFinal);
        tableData.setModel(getGenericTable());
        fillTable((DefaultTableModel) tableData.getModel(), life);

    }

    public void updateTableExpense(JTable tableData, JComboBox<String> jComboConta, String dataInicial, String dataFinal) {
        AccountEntity ae = new AccountDAO().getAccountByName(jComboConta.getSelectedItem().toString());
        List<ItemFinnanceEntity> life = new ExpenseDAO().getAllExpenseWithDate(ae, dataInicial, dataFinal);
        tableData.setModel(getGenericTable());
        fillTable((DefaultTableModel) tableData.getModel(), life);
    }
}
