/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.UserDAO;
import ENTITY.ItemFinnanceEntity;
import ENTITY.UserEntity;
import HELPERS.FACTORY.UserFactory;
import javax.swing.JTable;

/**
 *
 * @author osval
 */
public class RemoveController {

    public boolean deleteUser(String[] features) {
        UserEntity ue = UserFactory.createUserWithId(features);
        return new UserDAO().delete(ue);
    }

    public boolean deleteExpense(JTable table) {
        ItemFinnanceEntity ue = new ResearchController().getExpense(table.getValueAt(table.getSelectedRow(), 0).toString());
        return new UserDAO().delete(ue);
    }

    public boolean deleteRecipe(JTable table) {
        ItemFinnanceEntity ue = new ResearchController().getRecipe(table.getValueAt(table.getSelectedRow(), 0).toString());
        return new UserDAO().delete(ue);
    }

}
