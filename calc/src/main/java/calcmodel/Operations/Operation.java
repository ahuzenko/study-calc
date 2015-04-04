/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Operations;

/**
 *
 * @author User
 */
public interface Operation {
     public double execute(double arg1, double arg2);
     public String showDescription();
     void setDescription(String operationDescription);
     public String getOperationSign();
}
