/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tieneraizexactaono;

/**
 *
 * @author martinmelo
 */
import java.util.Arrays;
public class TieneRaizExactaONo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[]{4,3,9,7,2,1};
		System.out.println("Numeros originales: "+Arrays.toString(numeros));
		for (int i = 0; i < numeros.length; i++){
			int contador = 0;
			for(int j = 1; j <= numeros[i]; j++){
				if(numeros[i]%j == 0){
					contador++;
				}
			}
			//System.out.println(contador);
			if(contador%2==1){
				numeros[i] = (int)Math.sqrt(numeros[i]);
			}
			else{
				numeros[i] = (int)Math.pow(numeros[i],2);
			}
		}
		System.out.println("Numeros nuevos: "+Arrays.toString(numeros));
    }
    
}
