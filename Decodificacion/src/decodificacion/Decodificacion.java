/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodificacion;

/**
 *
 * @author martinmelo
 */
public class Decodificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String codificado = "t oxk lb kbytl";
        char[] array = codificado.toCharArray();
        //System.out.println(array[5]);
        int[] intarray = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == ' '){
                intarray[i] = 32;
            }
            else{
            intarray[i] = (int) array[i] - 19;
            if(intarray[i] < 97){
                    intarray[i] = intarray[i] + 26;
            }
            }
            System.out.print((char) intarray[i]);
        }
        System.out.println();
        
    }
    
}
