/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

import calcmodel.Engine.CalcFactory;
import calcmodel.Engine.Manage;
import calcmodel.Operations.*;

/**
 *
 * @author Sunny
 */
public class ListCreator {
     
    public Manage Arrange() {
        ArrayList<Operation> op = new ArrayList<Operation>();
        ArrayList<Creator> cr = new ArrayList<Creator>();
        cr.add(new CreatorAdd());
        cr.add(new CreatorMinus());
        cr.add(new CreatorMultiply());
        cr.add(new CreatorDiv());
        for(Creator c:cr){
            op.add(c.factoryMethod());
        }
    
        return CalcFactory.buildCalculator(op);
      
    }
}
