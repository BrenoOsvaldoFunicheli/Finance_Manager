/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author osval
 */
public class RecipeDAO extends DAOUtil {

    public ItemFinnanceEntity findRecipeEntity(Integer id) {
        return findItemFinnance(id);
    }

    public List<ItemFinnanceEntity> getAll() {
        OpenConnection();

        try {

            List<ItemFinnanceEntity> lue;
            lue = getEntityManager().createNamedQuery("ItemFinnanceEntity.getAllRecipe", ItemFinnanceEntity.class).getResultList();
            CloseConnection();

            return lue;
        } catch (Exception e) {
            CloseConnection();
            return null;
        }

    }

    public List<ItemFinnanceEntity> getAllWithUser(AccountEntity ae) {
        OpenConnection();

        try {

            List<ItemFinnanceEntity> lue;

            TypedQuery<ItemFinnanceEntity> tq = getEntityManager().createNamedQuery("ItemFinnanceEntity.findRecipeWithIdAccount", ItemFinnanceEntity.class);
            tq.setParameter("idAccount", ae);
            lue = tq.getResultList();
            CloseConnection();

            return lue;
        } catch (Exception e) {
            CloseConnection();
            e.printStackTrace();
            return null;

        }

    }

    public List<ItemFinnanceEntity> findById(AccountEntity ae) {
        OpenConnection();

        try {

            List<ItemFinnanceEntity> lue;

            TypedQuery<ItemFinnanceEntity> tq = getEntityManager().createNamedQuery("ItemFinnanceEntity.findRecipeWithIdAccount", ItemFinnanceEntity.class);
            tq.setParameter("idAccount", ae);
            lue = tq.getResultList();

            CloseConnection();

            return lue;
        } catch (Exception e) {
            CloseConnection();
            return null;
        }
    }

    public BigDecimal findValue(AccountEntity ae) {

        OpenConnection();
        try {
            Query tq = getEntityManager().createQuery("SELECT SUM(i.valueItem*i.quantity) FROM ItemFinnanceEntity i WHERE i.tipoItem = 'RECEITA' AND i.idAccount = :idAccount");
            tq.setParameter("idAccount", ae);

            BigDecimal b = (BigDecimal) tq.getSingleResult();
            CloseConnection();
            return b;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public ItemFinnanceEntity findRecipeEntityByName(String name) {
        OpenConnection();

        try {

            ItemFinnanceEntity lue;
            lue = getEntityManager().createNamedQuery("ItemFinnanceEntity.findByNameItem", ItemFinnanceEntity.class)
                    .setParameter("nameItem", name)
                    .getSingleResult();
            CloseConnection();

            return lue;
        } catch (Exception e) {
            CloseConnection();
            return null;
        }

    }

    @SuppressWarnings("unchecked")
    public List<ItemFinnanceEntity> getAllRecipeWithDate(AccountEntity ae, String dataInicial, String dataFinal) {
        OpenConnection();

        List<ItemFinnanceEntity> lue;

        Query tq = getEntityManager().createQuery("SELECT i FROM ItemFinnanceEntity i WHERE i.tipoItem = 'DESPESA' AND i.idAccount = :idAccount AND i.dateItem BETWEEN :di AND :df");
        tq.setParameter("idAccount", ae);
        tq.setParameter("di", dataInicial);
        tq.setParameter("df", dataFinal);

        lue = tq.getResultList();
        CloseConnection();

        return lue;
    }
}
