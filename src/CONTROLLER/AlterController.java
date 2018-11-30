/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.UserDAO;
import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import ENTITY.UserEntity;
import HELPERS.FACTORY.AccountFactory;
import HELPERS.FACTORY.ExpenseFactory;
import HELPERS.FACTORY.RecipeFactory;
import HELPERS.FACTORY.UserFactory;
import VIEW.Session;

/**
 *
 * @author osval
 */
public class AlterController {

    public boolean update(Object o) {
        return new UserDAO().update(o);
    }

    public boolean updateUser(String[] features) {
        UserEntity ue = UserFactory.createUserWithId(features);
        return update(ue);
    }

    public boolean updateAccount(String[] features) {
        AccountEntity ue = AccountFactory.createUserWithId(features);
        return update(ue);
    }

    public boolean updateRecipe(String[] features) {
        ItemFinnanceEntity ue = RecipeFactory.createUserWithId(features);
        return update(ue);
    }

    public boolean updateExpense(String[] features) {
        UserEntity ue = UserFactory.createUserWithId(features);
        return update(ue);
    }

    public boolean updateAccount(String[] fields, AccountEntity ae) {
        AccountEntity beforeae = AccountFactory.createAccount(ae.getIdUser(), fields);
        AccountEntity afterae = new ResearchController().findAccountByIdUserAndAccount(new Session(ae.getIdUser()), ae.getNameAccount()).get(0);
        beforeae.setIdAccount(afterae.getIdAccount());
        
        return update(beforeae);
    }

    public boolean updateExpense(String[] fields, ItemFinnanceEntity ife) {
        ItemFinnanceEntity afterief = new ResearchController().getExpense(ife.getNameItem());
        ItemFinnanceEntity beforeief = ExpenseFactory.createExpenseLess(fields);
        beforeief.setIdItemFinnance(afterief.getIdItemFinnance());
        beforeief.setIdAccount(afterief.getIdAccount());

        return update(beforeief);
    }

    public boolean updateRecipe(String[] fields, ItemFinnanceEntity ife) {
        ItemFinnanceEntity afterief = new ResearchController().getRecipe(ife.getNameItem());
        ItemFinnanceEntity beforeief = RecipeFactory.createRecipeLess(fields);
        beforeief.setIdItemFinnance(afterief.getIdItemFinnance());
        beforeief.setIdAccount(afterief.getIdAccount());

        return update(beforeief);
    }

}
