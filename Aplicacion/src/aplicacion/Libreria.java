/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Jairo
 */
public class Libreria {
    
    
    public String digit_to_string(int input){
        switch(input){
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            default:
                return "no data";
        }
    }
    
    public int[] echo_array(int[] input){
        return input;
    }
    
    public Object cualquier_cosa(boolean input){
        if (input)
            return new Object();
        else return null;
    }
    
    public boolean bit_to_boolean(int input){
        switch(input){
            case 0:
                return false;
            case 1:
                return true;
            default:
                return true;
        }
    }
    
  
    
}
