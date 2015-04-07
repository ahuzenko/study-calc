/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcview;

import calcmodel.Engine.Manage;
import utils.ListCreator;

import java.util.Scanner;

/**
 *
 * @author Sunny
 */
public class CalculatorMenu {
    

    
    
    private String [] items = {"Run", "Help", "Exit"};
    private Scanner in = new Scanner(System.in);
    private Manage clc;

    public CalculatorMenu( ) throws Exception{

        clc= (new ListCreator()). Arrange();

    }
    
    void displayHelp()
    {
       
        System.out.println( clc.getAllItems());
        
    
    }
    
    
    
    public void showMenu(){
         System.out.println("select menu number");
         for(int i=0; i<items.length; ++i)
         {
             System.out.println("\t"+(i+1) + ". " + items[i]);
         }
        
    }
    
    
    public void getChoise() throws Exception{
    
        int i;
        showMenu();
        while((i=in.nextInt()) != 3)
        {
            switch(i) {
                case 1:
                    calculateOperation();
                    break;
                case 2:
                    displayHelp();
                    break;
                default:
                    System.out.println("Unknown operation");
            }
            showMenu();
        }
            
    
     }
        
        


    public void calculateOperation() throws Exception {
        
        double arg1 = in.nextDouble();
        String str = in.next();
        double arg2 = in.nextDouble();
        
        System.out.println("Calculation result: " + arg1 + " " + str + " " + arg2+ " = " + clc.calculate(str, arg1, arg2));
        
    }
    
    
   
}
