/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import CONTROLLER.ResearchController;
import ENTITY.AccountEntity;
import VIEW.Session;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author osval
 */
public class ComboItemManager {

    public ComboBoxModel<String> getAccounts(Session session) {
        List<AccountEntity> acc = new ResearchController().findAccountByIdUser(session);
        String[] nameAccount = new String[acc.size()];

        for (int i = 0; acc.size() > i; i++) {
            nameAccount[i] = acc.get(i).getNameAccount();
        }

        return new DefaultComboBoxModel<>(nameAccount);
    }

}
