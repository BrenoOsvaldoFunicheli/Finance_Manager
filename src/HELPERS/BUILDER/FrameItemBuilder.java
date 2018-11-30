/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.BUILDER;

import CONTROLLER.AlterController;
import CONTROLLER.MessagerController;
import Manager.ComboItemManager;
import CONTROLLER.SaveController;
import ENTITY.ItemFinnanceEntity;
import VIEW.JDialogCadastroFinanceItem;
import VIEW.Session;
import java.awt.event.ActionEvent;

/**
 *
 * @author osval
 */
public class FrameItemBuilder {

    private final JDialogCadastroFinanceItem jif;

    public FrameItemBuilder(Session session) {
        jif = new JDialogCadastroFinanceItem(null, true, session);
    }

    public FrameItemBuilder(Session session, ItemFinnanceEntity ife) {
        jif = new JDialogCadastroFinanceItem(null, true, session, ife);
    }
    
    public FrameItemBuilder title(String name){
        jif.setTitle(name);
        
        return this;
    };

    public FrameItemBuilder BtnSalvarRecipe() {
        jif.getjBtnSalvar().addActionListener(
                (ActionEvent ae) -> {
                    String[] Recipeinfo = jif.getFields();
                    String[] Accouintinfo = new String[]{jif.getjComboConta().getSelectedItem().toString()};

                    new MessagerController().isSaveSuccessful(
                            new SaveController().saveRecipe(jif.getSession(), Accouintinfo, Recipeinfo));
                });
        return this;
    }

    public FrameItemBuilder BtnSalvarExpense() {

        jif.getjBtnSalvar().addActionListener(
                (ActionEvent ae) -> {
                    String[] Recipeinfo = jif.getFields();
                    String[] Accouintinfo = new String[]{jif.getjComboConta().getSelectedItem().toString()};

                    new MessagerController().isSaveSuccessful(
                            new SaveController().saveExpense(jif.getSession(), Accouintinfo, Recipeinfo));
                });

        return this;
    }

    public FrameItemBuilder BtnAlterarExpense() {

        jif.getjBtnSalvar().addActionListener(
                (ActionEvent ae) -> {
                    new MessagerController().isAlterSuccessful(
                            new AlterController().updateExpense(jif.getFields(), jif.getIfe()));
                });

        return this;
    }

    public FrameItemBuilder BtnAlterarRecipe() {

        jif.getjBtnSalvar().addActionListener(
                (ActionEvent ae) -> {
                    new MessagerController().isAlterSuccessful(
                            new AlterController().updateRecipe(jif.getFields(), jif.getIfe()));
                });

        return this;
    }

    public FrameItemBuilder combo() {
        jif.getjComboConta().setModel(new ComboItemManager().getAccounts(jif.getSession()));
        return this;
    }
    
    public FrameItemBuilder sTitle(String name) {
        jif.setTitle(name);
        return this;
    }
    
    public JDialogCadastroFinanceItem builder() {
       
        return this.jif;
    }

    public FrameItemBuilder nome(String nome) {
        jif.getjTextNome().setText(nome);
        return this;
    }

    public FrameItemBuilder valor(String valor) {
        jif.getjSpinnerValor().setValue(Double.valueOf(valor));
        return this;
    }

    public FrameItemBuilder quantidade(String quantidade) {
        jif.getjSpinnerQtd().setValue(Integer.valueOf(quantidade));
        return this;
    }

    public FrameItemBuilder descricao(String desc) {
        jif.getjTextDesc().setText(desc);
        return this;
    }

}
