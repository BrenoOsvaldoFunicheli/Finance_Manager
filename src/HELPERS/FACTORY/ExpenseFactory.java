/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.FACTORY;

import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import HELPERS.BUILDER.ItemFinnanceBuider;
import java.util.Date;
import javax.swing.JTable;

/**
 *
 * @author osval
 */
public class ExpenseFactory {

    public static ItemFinnanceEntity createExpense(String[] features) {

        return new ItemFinnanceBuider()
                .name(features[1])
                .describ(features[2])
                .value(Double.parseDouble(features[3]))
                .quantity(Integer.parseInt(features[4]))
                .dateItem(new Date()).builderExpense();
    }

    public static ItemFinnanceEntity createExpenseLess(String[] features) {

        return new ItemFinnanceBuider()
                .name(features[0])
                .describ(features[1])
                .value(Double.parseDouble(features[2]))
                .quantity(Integer.parseInt(features[3]))
                .dateItem(new Date()).builderExpense();
    }

    public static ItemFinnanceEntity createExpense(AccountEntity ae, String[] featuresExpense) {

        return new ItemFinnanceBuider()
                .account(ae)
                .name(featuresExpense[0])
                .describ(featuresExpense[1])
                .value(Double.parseDouble(featuresExpense[2]))
                .quantity(Integer.parseInt(featuresExpense[3]))
                .dateItem(new Date()).builderExpense();
    }

    public static ItemFinnanceEntity createExpense(JTable table) {
        return new ItemFinnanceBuider()
                .name(table.getValueAt(table.getSelectedRow(), 0).toString())
                .describ(table.getValueAt(table.getSelectedRow(), 1).toString())
                .value(Double.parseDouble(table.getValueAt(table.getSelectedRow(), 2).toString()))
                .quantity(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 3).toString())).builderExpense();
    }

    public static ItemFinnanceEntity createRecipe(JTable table) {
        return new ItemFinnanceBuider()
                .name(table.getValueAt(table.getSelectedRow(), 0).toString())
                .describ(table.getValueAt(table.getSelectedRow(), 1).toString())
                .value(Double.parseDouble(table.getValueAt(table.getSelectedRow(), 2).toString()))
                .quantity(Integer.parseInt(table.getValueAt(table.getSelectedRow(), 3).toString())).builderRecipe();
    }

}
