/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Operations;


public class CreatorDiv extends Creator {

    @Override
    public OperationTempl factoryMethod() {
        return new OperationDiv();
    }
    
}
