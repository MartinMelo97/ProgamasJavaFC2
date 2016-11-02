/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excluir5;

/**
 *
 * @author martinmelo
 */
public class Excluir5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1 = 1;
        int var2 = 499;
        int cont = 0;
        for(int i = var1; i<=var2; i++){
            if(i % 5 == 0 && i % 2 > 0){
                cont = cont + 0;
                System.out.println(i);
            }
            else if(i % 50 == 0 && i % 20 > 0){
            cont = cont + 0;
                System.out.println(i);
            }
            else{
                cont++;
            }
        }
        System.out.println(cont);
    
    

    }
    
}
