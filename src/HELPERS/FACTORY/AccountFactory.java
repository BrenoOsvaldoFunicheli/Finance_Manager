/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.FACTORY;

import ENTITY.AccountEntity;
import ENTITY.UserEntity;
import ENUMSYSTEM.TypeAccountEnum;
import HELPERS.BUILDER.AccountBuilder;
import javax.swing.JTable;

/**
 *
 * @author osval
 */
public class AccountFactory {

    public static AccountEntity createAccount(UserEntity ue, String[] features) {

        return new AccountBuilder()
                .user(ue)
                .name(features[0])
                .typeAccount(TypeAccountEnum.POUPANCA)
                .fgAtivo(true).builder();
    }

    public static AccountEntity createAccountWithName(UserEntity ue, String[] features) {

        return new AccountBuilder()
                .user(ue)
                .name(features[0])
                .fgAtivo(true).builder();
    }

    public static AccountEntity createAccountOnlyId(String[] features) {

        return new AccountBuilder()
                .id(Integer.parseInt(features[0])).builder();
    }

    public static AccountEntity createUserWithId(String[] features) {

        return new AccountBuilder()
                .id(Integer.parseInt(features[0]))
                .name(features[1])
                .typeAccount(TypeAccountEnum.POUPANCA)
                .fgAtivo(true).builder();
    }

    public static AccountEntity createAccount(JTable table, UserEntity ue) {
        return new AccountBuilder()
                .user(ue)
                .name(table.getValueAt(table.getSelectedRow(), 0).toString())
                .typeAccount(TypeAccountEnum.POUPANCA)
                .fgAtivo(Boolean.valueOf(table.getValueAt(table.getSelectedRow(), 3).toString())).builder();
    }

}
