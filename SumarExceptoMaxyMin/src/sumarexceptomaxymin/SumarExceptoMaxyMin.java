/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarexceptomaxymin;

/**
 *
 * @author martinmelo
 */
public class SumarExceptoMaxyMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    int menor = 100;
    int mayor = 0;
    int contador = 0;
    
    for(int i = 0; i < arreglo.length; i++){
      
      if(arreglo[i] > mayor){
        mayor = i;
      	}
      
      if(arreglo[i] < menor){
        menor = i;
		}
	}
    
    for(int i = 0; i < arreglo.length; i++){
      
      if(i == mayor || i == menor){
        contador = contador + 0;
      }
      else{
      	contador = contador + arreglo[i];
      }
  	}
    
    System.out.println("Resultado de la suma: "+contador);
    }
    
}
