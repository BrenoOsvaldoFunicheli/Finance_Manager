/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.BUILDER;

import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import ENUMSYSTEM.TypeItemEnum;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author osval
 */
public class ItemFinnanceBuider {
    
    private final ItemFinnanceEntity ife;

    public ItemFinnanceBuider() {
        this.ife = new ItemFinnanceEntity();
    }

    public ItemFinnanceEntity getIfe() {
        return ife;
    }
    
    public ItemFinnanceBuider name(String name){
        ife.setNameItem(name);
        return this;
    };

    public ItemFinnanceBuider describ(String describ){
        ife.setDescrib(describ);
        return this;
    };

    public ItemFinnanceBuider value(Double value){
        ife.setValueItem(BigDecimal.valueOf(value));
        return this;
    };
    
    public ItemFinnanceBuider dateItem(Date d){
        ife.setDateItem(d);
        return this;
    };
    
    public ItemFinnanceBuider account(AccountEntity ae){
        ife.setIdAccount(ae);
        return this;
    };
    
    public ItemFinnanceBuider id(Integer id){
        ife.setIdItemFinnance(id);
        return this;
    };
    
    public ItemFinnanceBuider quantity(Integer qtd){
        ife.setQuantity(qtd);
        return this;
    };
    
    public ItemFinnanceEntity builderExpense(){
        getIfe().setTipoItem(TypeItemEnum.EXPENSE.getTipo());
        
        return getIfe();
    }
    
    public ItemFinnanceEntity builderRecipe(){
        getIfe().setTipoItem(TypeItemEnum.RECIPE.getTipo());
        
        return getIfe();
    }
}
