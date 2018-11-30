/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENUMSYSTEM;

/**
 *
 * @author osval
 */
public enum TypeAccountEnum {

    POUPANCA("CONTA_POUPANCA"),
    CORRENTE("CONTA_CORRENTE");
    
    private String tipo;

    private TypeAccountEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public static TypeAccountEnum getPOUPANCA() {
        return POUPANCA;
    }

    public static TypeAccountEnum getCORRENTE() {
        return CORRENTE;
    }
    
    
    
}
