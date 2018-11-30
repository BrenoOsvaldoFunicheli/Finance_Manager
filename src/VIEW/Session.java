/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import ENTITY.UserEntity;

/**
 *
 * @author osval
 */
public class Session {
    
    private final UserEntity userEntity;

    public Session(UserEntity usm) {
        this.userEntity = usm;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }
    
    
    
}
