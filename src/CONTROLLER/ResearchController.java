/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.AccountDAO;
import DAO.ExpenseDAO;
import DAO.RecipeDAO;
import DAO.UserDAO;
import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import ENTITY.UserEntity;
import HELPERS.FACTORY.AccountFactory;
import HELPERS.FACTORY.UserFactory;
import VIEW.Session;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author osval
 */
public class ResearchController {

    public List<UserEntity> getAllUser() {
        return new UserDAO().findAll();
    }

    public List<UserEntity> findUser(Integer id) {
        return new UserDAO().findById(id);
    }

    public boolean findUser(String[] features) {
        UserEntity ue = UserFactory.createUser(features);

        try {
            new UserDAO().findUser(ue).get(0);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public UserEntity getUser(String[] features) {
        UserEntity ue = UserFactory.createUser(features);

        ue = new UserDAO().findUser(ue).get(0);

        System.out.println(ue);
        return ue;
    }

    public List<AccountEntity> getAllAccount() {
        return new AccountDAO().getAll();
    }

    public AccountEntity findAccount(Integer id) {
        return new AccountDAO().findById(id);
    }

    public List<AccountEntity> findAccountByIdUser(String[] features) {
        UserEntity ue = UserFactory.createUserOnlyId(features[0]);
        return new AccountDAO().findByIdUser(ue);
    }

    public List<AccountEntity> findAccountByIdUser(Session session) {
        return new AccountDAO().findByIdUser(session.getUserEntity());
    }
    
    public List<AccountEntity> findAccountByIdUserAndAccount(Session session, String nome) {
        return new AccountDAO().findByIdUser(session.getUserEntity(), nome);
    }

    public ItemFinnanceEntity getExpense(Integer id) {
        return new ExpenseDAO().findExpenseEntity(id);
    }
    
    public ItemFinnanceEntity getExpense(String name) {
        return new ExpenseDAO().findExpenseEntityByName(name);
    }

    public List<ItemFinnanceEntity> getAllExpense() {
        return new ExpenseDAO().getAll();
    }

    public List<ItemFinnanceEntity> findExpenseByIdAccount(String[] features) {
        AccountEntity ae = AccountFactory.createAccountOnlyId(features);
        return new ExpenseDAO().findById(ae);
    }

    public ItemFinnanceEntity getRecipe(Integer id) {
        return new RecipeDAO().findRecipeEntity(id);
    }

    public ItemFinnanceEntity getRecipe(String nome) {
        return new RecipeDAO().findRecipeEntityByName(nome);
    }

    public List<ItemFinnanceEntity> getAllRecipe() {
        return new RecipeDAO().getAll();
    }

    public List<ItemFinnanceEntity> findRecipeByIdAccount(String[] features) {
        AccountEntity ae = AccountFactory.createAccountOnlyId(features);
        return new RecipeDAO().findById(ae);
    }

    public BigDecimal getAllExpense(AccountEntity ae) {
        return new ExpenseDAO().findSumOfTheExpense(ae);
    }
    
    public BigDecimal getAllRecipe(AccountEntity ae) {
        return new RecipeDAO().findValue(ae);
    }
    

}
