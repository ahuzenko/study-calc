/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Operations;


import calcmodel.Operations.OperationTempl;

public class OperationMultiply extends OperationTempl {


    public OperationMultiply() {
        sign = "*";
        helpDescription ="Default help string for "+ sign + " operation";
        
    }


    @Override
    public double execute(double arg1, double arg2) {
        return arg1*arg2;
    }
    @Override
    public String showDescription() {
        return helpDescription;
    }

    @Override
    public void setDescription(String operationDescription) {
        helpDescription = operationDescription;
    }

    @Override
    public String getOperationSign() {
       return sign;
    }

       
}
