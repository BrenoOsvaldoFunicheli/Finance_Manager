/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.BUILDER;

import ENTITY.AccountEntity;
import ENTITY.UserEntity;
import ENUMSYSTEM.TypeAccountEnum;

/**
 *
 * @author osval
 */
public class AccountBuilder {

    private final AccountEntity ae = new AccountEntity();

    public AccountBuilder name(String name) {
        ae.setNameAccount(name);
        return this;
    }

    public AccountBuilder user(UserEntity user) {
        ae.setIdUser(user);
        return this;
    }

    public AccountBuilder fgAtivo(Boolean fg) {
        ae.setFgAtivo(fg);
        return this;
    }
    
    public AccountBuilder typeAccount(TypeAccountEnum tae) {
        ae.setTipoAccount(tae.getTipo());
        return this;
    }

    public AccountBuilder id(Integer id) {
        ae.setIdAccount(id);
        return this;
    }
    
    public AccountEntity builder(){
        return ae;
    }

}
