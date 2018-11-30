/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ENTITY.AccountEntity;
import ENTITY.UserEntity;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author osval
 */
public class AccountDAO extends DAOUtil {

    public AccountEntity findById(Integer id) {

        AccountEntity ae = null;

        try {
            OpenConnection();
            ae = getEntityManager().find(AccountEntity.class, id);
        } finally {
            CloseConnection();
        }

        return ae;
    }

    public List<AccountEntity> getAll() {
        OpenConnection();

        try {

            List<AccountEntity> lue;
            lue = getEntityManager().createNamedQuery("AccountEntity.findAll", AccountEntity.class).getResultList();
            CloseConnection();

            return lue;

        } catch (Exception e) {
            CloseConnection();
            return null;
        }

    }

    public List<AccountEntity> findByIdUser(UserEntity ue) {
        OpenConnection();

        try {
            List<AccountEntity> lue;
            TypedQuery<AccountEntity> tq = getEntityManager().createNamedQuery("AccountEntity.findAccountByIdUser", AccountEntity.class);
            tq.setParameter("idUser", ue);
            lue = tq.getResultList();

            CloseConnection();
            return lue;

        } catch (Exception e) {
            e.printStackTrace();
            CloseConnection();
            return null;
        }
    }

    public AccountEntity getAccountByName(String toString) {
        OpenConnection();

        try {

            List<AccountEntity> lue;
            TypedQuery<AccountEntity> tq = getEntityManager().createNamedQuery("AccountEntity.findByNameAccount", AccountEntity.class);

            tq.setParameter("nameAccount", toString);
            lue = tq.getResultList();

            return lue.get(0);

        } catch (Exception e) {
            CloseConnection();
            e.printStackTrace();
            return null;
        }
    }

    public List<AccountEntity> findByIdUser(UserEntity ue, String nome) {
        OpenConnection();

        try {
            
            List<AccountEntity> lue;
            TypedQuery<AccountEntity> tq = getEntityManager().createNamedQuery("AccountEntity.findAccountByIdUserAccount", AccountEntity.class);
            tq.setParameter("idUser", ue);
            tq.setParameter("name", nome);
            lue = tq.getResultList();

            CloseConnection();
            return lue;

        } catch (Exception e) {
            e.printStackTrace();
            CloseConnection();
            return null;
        }
    }

}
