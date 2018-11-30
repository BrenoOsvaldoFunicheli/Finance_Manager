/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ENTITY.UserEntity;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author osval
 */
public class UserDAO extends DAOUtil {


    public List<UserEntity> findAll() {
        OpenConnection();

        try {
            
            List<UserEntity> lue;
            lue = getEntityManager().createNamedQuery("UserEntity.findAllUser", UserEntity.class).getResultList();
            CloseConnection();
            
            return lue;
        } catch (Exception e) {
            CloseConnection();
            return null;
        }

    }

    public List<UserEntity> findById(Integer id) {
        OpenConnection();

        try {
            List<UserEntity> lue;
            
            TypedQuery<UserEntity> query;
            query = getEntityManager().createNamedQuery("UserEntity.findByIdUser", UserEntity.class);
            query.setParameter("idUser", id);
            
            lue = query.getResultList();
            CloseConnection();
            return lue;
            
        } catch (Exception e) {
            CloseConnection();
            return null;
        }

    }
    
    public List<UserEntity> findUser(UserEntity ue) {
        OpenConnection();

        try {
            List<UserEntity> lue;
            
            TypedQuery<UserEntity> query;
            query = getEntityManager().createNamedQuery("UserEntity.findUser", UserEntity.class);
            query.setParameter("login", ue.getLogin());
            query.setParameter("passwordUser", ue.getPasswordUser());
            
            lue = query.getResultList();
            CloseConnection();
            return lue;
            
        } catch (Exception e) {
            CloseConnection();
            return null;
        }

    }

}
