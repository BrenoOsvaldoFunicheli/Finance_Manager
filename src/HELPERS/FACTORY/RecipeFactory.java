/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS.FACTORY;

import ENTITY.AccountEntity;
import ENTITY.ItemFinnanceEntity;
import HELPERS.BUILDER.ItemFinnanceBuider;
import java.util.Date;

/**
 *
 * @author osval
 */
public class RecipeFactory {

    public static ItemFinnanceEntity createRecipe(String[] features) {

        return new ItemFinnanceBuider()
                .name(features[1])
                .describ(features[2])
                .value(Double.parseDouble(features[3]))
                .quantity(Integer.parseInt(features[4]))
                .dateItem(new Date()).builderRecipe();
    }

    public static ItemFinnanceEntity createRecipeLess(String[] features) {

        return new ItemFinnanceBuider()
                .name(features[0])
                .describ(features[1])
                .value(Double.parseDouble(features[2]))
                .quantity(Integer.parseInt(features[3]))
                .dateItem(new Date()).builderRecipe();
    }

    public static ItemFinnanceEntity createRecipe(AccountEntity ae, String[] featuresExpense) {

        return new ItemFinnanceBuider()
                .account(ae)
                .name(featuresExpense[0])
                .describ(featuresExpense[1])
                .value(Double.parseDouble(featuresExpense[2]))
                .quantity(Integer.parseInt(featuresExpense[3]))
                .dateItem(new Date()).builderRecipe();
    }

    public static ItemFinnanceEntity createUserWithId(String[] features) {
      
        return new ItemFinnanceBuider()
                .id(Integer.parseInt(features[0]))
                .name(features[1])
                .describ(features[2])
                .value(Double.parseDouble(features[3]))
                .quantity(Integer.parseInt(features[4]))
                .dateItem(new Date()).builderRecipe();

    }

}
