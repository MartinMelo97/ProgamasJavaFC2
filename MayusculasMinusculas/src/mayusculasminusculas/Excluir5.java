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
public class Excluir5 {
    public static void main(String[] args){
        int var1 = 1;
        int var2 = 9;
        int cont = 0;
        for(int i = var1; i<var2; i++){
            if(i != 5){
                cont++;
            }
        }
        System.out.println(cont);
    }
    
}
