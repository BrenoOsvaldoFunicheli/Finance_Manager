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
public enum MessageEnum {
    
    SAVE("Salvo"),
    REMOVE("Removido"),
    ALTER("Alterado");

    private final String name;
    
    MessageEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
