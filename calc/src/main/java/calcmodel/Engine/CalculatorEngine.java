/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcmodel.Engine;

import java.util.ArrayList;

import calcmodel.Operations.Operation;

/**
 *
 * @author User
 */
public class CalculatorEngine implements Manage {
    
    final private ArrayList<Operation> operations;
    
    private double LastResult = 0;
    
    public CalculatorEngine(final ArrayList<Operation> op)
    {
        operations = op;
    }
    

   public StringBuilder getAllItems()
   {
       StringBuilder sb = new StringBuilder();
       for(Operation op: operations){
           sb.append(op.getOperationSign()+": " + op.showDescription()+"\n");
        }
       
       
       return sb;
   }
   
   private Operation findOpertionBySign(String s) throws OperationNotFoundException{
        
   for(Operation op: operations){
       if(op.getOperationSign().equals(s)) 
           return op;
       
   }
        throw new OperationNotFoundException(s);
   }
    
   

    public double calculate(String sign, double arg1, double arg2)throws Exception{
     try{
        LastResult = this.findOpertionBySign(sign).execute(arg1, arg2);
     }catch(OperationNotFoundException e){
             
         throw new Exception("Operation " + sign + " not found. " +e); 
     }catch(ArithmeticException e)
     {
         throw new Exception("UUPS, Arithmetic exception. Cannot calculate "+ arg1 + " " + sign +" "+ arg2+ ". Check arguments\n"+ e);
     
     }
     return LastResult;
    }
    

    public double getLastResult() {
       return LastResult;
    }


    public String getHelpBySign(String sign)throws OperationNotFoundException {
       
        return findOpertionBySign(sign).showDescription();
        
    }

    
    
}
