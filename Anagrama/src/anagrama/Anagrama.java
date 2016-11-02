/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

/**
 *
 * @author martinmelo
 */
public class Anagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String original = "superposición";
        String prueba = "presuposición";
        int acorig = 0;
        int acpru = 0;
        char[] originalarr = original.toCharArray();
        char[] pruebaarr = prueba.toCharArray();
        
        for(int i = 0; i < originalarr.length; i++){
            acorig = acorig + (int) originalarr[i];
        }
        
        for(int j = 0; j < pruebaarr.length; j++){
            acpru = acpru + (int) pruebaarr[j];
        }
        
        if(acorig == acpru){
            System.out.println("Son anagrama");
        }
        else{
            System.out.println("No son anagrama");
        }
        
    }
    
}
