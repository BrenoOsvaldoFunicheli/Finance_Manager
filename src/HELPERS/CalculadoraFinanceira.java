/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS;

import CONTROLLER.ResearchController;
import ENTITY.AccountEntity;
import java.math.BigDecimal;

/**
 *
 * @author osval
 */
public class CalculadoraFinanceira implements Calculadora {

    private final ResearchController rc;

    public CalculadoraFinanceira() {
        this.rc = new ResearchController();
    }

    @Override
    public BigDecimal calcularTotal(AccountEntity ae) {
        try {
            return calcRecipe(ae).subtract(calcExpense(ae));
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }

    public BigDecimal calcRecipe(AccountEntity ae) {
        return rc.getAllRecipe(ae);
    }
    
    public BigDecimal calcExpense(AccountEntity ae) {
        return rc.getAllExpense(ae);
    }
}
