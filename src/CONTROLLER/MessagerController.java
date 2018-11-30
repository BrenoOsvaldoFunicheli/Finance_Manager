/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import ENUMSYSTEM.MessageEnum;
import javax.swing.JOptionPane;

/**
 *
 * @author osval
 */
public class MessagerController {

    public void isSaveSuccessful(boolean response) {
        if (response) {
            successful(MessageEnum.SAVE);
        } else {
            failed(MessageEnum.SAVE);
        }
    }

    public void isAlterSuccessful(boolean response) {
        if (response) {
            successful(MessageEnum.ALTER);
        } else {
            failed(MessageEnum.ALTER);
        }
    }

    public void isRemoveSuccessful(boolean response) {
        if (response) {
            successful(MessageEnum.REMOVE);
        } else {
            failed(MessageEnum.REMOVE);
        }
    }

    private void successful(MessageEnum me) {
        JOptionPane.showMessageDialog(null, me.getName() + "com sucesso");
    }

    private void failed(MessageEnum me) {
        JOptionPane.showMessageDialog(null, me.getName() + "com sucesso");

    }
}
