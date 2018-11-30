package ENUMSYSTEM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author osval
 */
public enum TypeItemEnum {
 
    EXPENSE("DESPESA"),
    RECIPE("RECEITA");
    
    private final String tipo;

    private TypeItemEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public static TypeItemEnum getEXPENSE() {
        return EXPENSE;
    }

    public static TypeItemEnum getRECIPE() {
        return RECIPE;
    }
    
    
}
