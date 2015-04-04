/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Engine;

/**
 *
 * @author Sunny
 */
public class OperationNotFoundException extends ClassNotFoundException{
    String message;
    public OperationNotFoundException(String str2) {
       message=str2;
    }
    @Override
    public String toString(){ 
       return ("Requested operation was not included. " + message) ;
    }
}
