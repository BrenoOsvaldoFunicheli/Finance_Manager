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
public enum Temas {
   
    FLOWER("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"),
    MCWIN("com.jtattoo.plaf.mcwin.McWinLookAndFeel"),
    AERO("com.jtattoo.plaf.aero.AeroLookAndFeel"),
    ALUMINIUM("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"),
    BERNS("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel"),
    FAST("com.jtattoo.plaf.fast.FastLookAndFeel"),
    GRAPHT("com.jtattoo.plaf.graphite.GraphiteLookAndFeel"),
    MINT("com.jtattoo.plaf.mint.MintLookAndFeel"),
    ACRY("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
    
    private String skin;

    private Temas(String skin) {
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }
    
    
}
