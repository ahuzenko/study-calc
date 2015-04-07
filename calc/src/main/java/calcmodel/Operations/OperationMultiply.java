/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Operations;






public class OperationMultiply extends OperationTempl {


    public OperationMultiply() {
        sign = "*";
        helpDescription ="Default help string for "+ sign + " operation";
        
    }



    public double execute(double arg1, double arg2) {
        return arg1*arg2;
    }

    public String showDescription() {
        return helpDescription;
    }

    public void setDescription(String operationDescription) {
        helpDescription = operationDescription;
    }

    public String getOperationSign() {
       return sign;
    }

       
}
