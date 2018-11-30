/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.FACTORY;

import ENTITY.UserEntity;

/**
 *
 * @author osval
 */
public class UserFactory {
 
    public static UserEntity createUser(String[] features){
        
        return new UserEntity(
                features[0],
                features[1]);
    }
    
    public static UserEntity createUserWithId(String[] features){
        
        return new UserEntity(
                Integer.parseInt(features[0]),
                features[1],
                features[2] );
    }

    public static UserEntity createUserOnlyId(String id) {
        return new UserEntity(Integer.parseInt(id));
    }
}
