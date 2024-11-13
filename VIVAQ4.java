/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva.q4;


import java.util.Scanner;

public class VIVAQ4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a valid integer: ");
        String input = scanner.nextLine();
        Boolean valid = false;
        int j = 0;
        int num=0;
        
        while (!valid){ 
            
            if (j != 0){
                System.out.print("Invalid input. Please re-enter a valid +ve integer:");
                input = scanner.nextLine();
            }
            else {
                j++;
            }
            
            
            for (int i=0;i<input.length();i++){
                char checker = input.charAt(i);
                if(input.contains(".")){
                    break;
                }
                
                if(!Character.isDigit(checker)){
                    valid = false;
                    break; 
                }
                else{
                    valid = true;
                }
                
            }
            if (valid){
                num = Integer.parseInt(input);
                if (num > 0){
                    valid = true;
                }
                else {
                    valid = false;
                }
            }
        }
        
        System.out.println("you've inputed a valid integer!");
        
        if (num%2 == 0){
            System.out.println("The integer is even!"); 
        }
        else {
            System.out.println("The integer is odd!");
        } 
    }
    
}