/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juntarpalabras;

/**
 *
 * @author martinmelo
 */
public class JuntarPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String string1 = "Bm";
    String string2 = "aa";
    String string3 = "tn";
    
  	
     String batman = palabreo(string1, string2, string3);
    System.out.println(batman);
    }
    
    public static String palabreo(String str1, String str2, String str3){
    	String[] strarr1 = str1.split("");
    	String[] strarr2 = str2.split("");
    	String[] strarr3 = str3.split("");
    
    	String[] strfinal = new String[strarr1.length];
    	String todojunto = "";
    	
    for(int i =  0; i < strarr1.length; i++){
      strfinal[i] = strarr1[i] + strarr2[i] + strarr3[i];
      todojunto = todojunto + strfinal[i];
    }
    
    return todojunto;
    
	}
    
}
