/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.DAOUtil;
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
public class SaveController {

    private boolean save(Object o) {
        return new DAOUtil().save(o);
    }

    public boolean saveUser(String[] features) {
        UserEntity ue = UserFactory.createUser(features);
        return save(ue);
    }

    public boolean saveAccount(Session s, String[] features) {

        AccountEntity ae = AccountFactory.createAccount(s.getUserEntity(), features);
        return save(ae);
    }

    public boolean saveExpense(Session s, String[] featuresAccount, String[] featuresExpense) {

        try {
            AccountEntity ae = new ResearchController().findAccountByIdUserAndAccount(s, featuresAccount[0]).get(0);
            ItemFinnanceEntity ife = ExpenseFactory.createExpense(ae, featuresExpense);
            return save(ife);
        } catch (Exception e) {
            return false;
        }
    }

    public boolean saveRecipe(Session s, String[] featuresAccount, String[] featuresExpense) {

        try {
            AccountEntity ae = new ResearchController().findAccountByIdUserAndAccount(s, featuresAccount[0]).get(0);
            ItemFinnanceEntity ife = RecipeFactory.createRecipe(ae, featuresExpense);
            return save(ife);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
