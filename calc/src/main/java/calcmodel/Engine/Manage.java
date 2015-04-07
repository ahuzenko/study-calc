/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Engine;

/**
 *
 * @author User
 */
public interface Manage{



    public double calculate(String sign, double arg1, double arg2)throws Exception;
    public String getHelpBySign(String sign)throws OperationNotFoundException;
    public StringBuilder getAllItems();
}
