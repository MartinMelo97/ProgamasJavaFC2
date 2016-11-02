/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayusculasminusculas;

/**
 *
 * @author martinmelo
 */
import java.util.Scanner;
public class MayusculasMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String variable;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Da la cadena a convertir");
        variable = sc.nextLine();
        
        String[] vararr = variable.split("");
        
        for(int i = 0; i < vararr.length; i++){
            
            if(vararr[i] == vararr[i].toLowerCase()){
                
                vararr[i] = vararr[i].toUpperCase();
            }
            
            else if(vararr[i] == vararr[i].toUpperCase()){
                
                vararr[i] = vararr[i].toLowerCase();
            }
            
            System.out.print(vararr[i]);
        }
        
        System.out.println();
        
    }
    
}
