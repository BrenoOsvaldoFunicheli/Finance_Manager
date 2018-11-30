/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ENTITY.ItemFinnanceEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author osval
 */
public class DAOUtil {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public DAOUtil() {
//        OpenConnection();
    }

    public boolean OpenConnection() {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("FinnanceManagerPU");
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

    public void commit() {
        entityManager.getTransaction().commit();
    }

    public void rollback() {
        entityManager.getTransaction().rollback();
    }

    public boolean CloseConnection() {
        try {
            entityManager.close();
            entityManagerFactory.close();

        } catch (Exception e) {

            return false;
        }
        return true;
    }

    public boolean save(Object o) {

        try {
            this.OpenConnection();
            entityManager.persist(o);
            commit();

        } catch (Exception e) {
            e.printStackTrace();
            rollback();
            return false;
        }

        this.CloseConnection();
        return true;
    }

    public boolean update(Object o) {

        try {
            this.OpenConnection();
            getEntityManager().merge(o);
            commit();

        } catch (Exception e) {
            rollback();
            this.CloseConnection();
            return false;
        }

        this.CloseConnection();
        return true;
    }

    public boolean delete(Object o) {

        try {
            this.OpenConnection();
            getEntityManager().remove(getEntityManager().merge(o));
            commit();

        } catch (Exception e) {
            rollback();

        } finally {
            this.CloseConnection();
        }

        return true;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    protected ItemFinnanceEntity findItemFinnance(Integer id) {
        ItemFinnanceEntity ife = null;

        try {
            OpenConnection();
            ife = getEntityManager().find(ItemFinnanceEntity.class, id);
        } finally {
            CloseConnection();
        }

        return ife;
    }
}
