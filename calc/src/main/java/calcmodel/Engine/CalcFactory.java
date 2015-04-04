/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Engine;

import calcmodel.Operations.Operation;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CalcFactory {
    public static Manage buildCalculator(ArrayList<Operation> op)
    {
        return new CalculatorEngine(op);
    }

}
