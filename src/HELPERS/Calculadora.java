/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS;

import ENTITY.AccountEntity;
import java.math.BigDecimal;

/**
 *
 * @author osval
 */
interface Calculadora {
 
     public BigDecimal calcularTotal(AccountEntity ae); 
}
