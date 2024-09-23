/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordreserve;

import java.util.Scanner;

/**
 *
 * @author mukun
 */
public class WordReserve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter a word");
        
        String word = input.nextLine();
        
        char[] wordArray = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            
            wordArray[i] = word.charAt(i);
        }
        
        String wordReverse = "";
        
        for (int i = wordArray.length - 1; i >= 0; i--) {
            
            wordReverse += wordArray[i];
            
            System.out.print(wordArray[i]);
        } 
        
        System.out.println("The reverse is: " + wordReverse);
        // TODO code application logic here
    }
    
}
