package calcview;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ListCreator;
/**
 *
 * @author User
 */
public class RunnerCalculator {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
            CalculatorMenu cm = null;
            try {
                cm = new CalculatorMenu();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RunnerCalculator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(RunnerCalculator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(RunnerCalculator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(RunnerCalculator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(RunnerCalculator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(RunnerCalculator.class.getName()).log(Level.SEVERE, null, ex);
            }
            cm.getChoise();
   
    }


}
