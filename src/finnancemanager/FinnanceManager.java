/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finnancemanager;

import CONTROLLER.RoutesController;

public class FinnanceManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new RoutesController().callLogin();
//        System.out.println(new Date("12/12/1999"));
    }
}
