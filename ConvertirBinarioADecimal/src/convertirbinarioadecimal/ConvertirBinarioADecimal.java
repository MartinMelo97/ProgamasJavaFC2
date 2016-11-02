/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertirbinarioadecimal;

/**
 *
 * @author martinmelo
 */
import java.util.Scanner;
public class ConvertirBinarioADecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numero;
		char[] arraybinario;
		int longitud;
		double sumador = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el numero en binario a convertir: ");
		numero = leer.nextLine();
		arraybinario = numero.toCharArray();
		longitud = arraybinario.length;
		if(numero != "0"){
			double valor;
			int exp = 0;
			for(int i = longitud-1;i>-1;i--){
				if(arraybinario[i] == '1'){
					valor = Math.pow(2, exp);
					System.out.println(valor);
					sumador = sumador + valor;
					
				}
				exp++;
			}
		}
		else
			sumador = 0;
		System.out.println("Decimal: "+sumador);
		
    }
    
}
