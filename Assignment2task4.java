/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2task4;

public class Assignment2task4 {
    public static void main(String[] args) {
        int times;
        int length;
        int space;
        for (length=1;length<=10;length++){
            for (times = 1;times <= length;times++){
                System.out.print("*");
            }
            System.out.println("");  
        } 
        
        for (length=10;length>=1;length--){
            for (times = 1;times <= length;times++){
                System.out.print("*");
            }
            System.out.println("");  
        } 
        
        for (length=10;length>=1;length--){
            for (space = 9;space >= length;space--){
                System.out.print(' ');
            }
            for (times = 1;times <=length;times++){
                System.out.print('*');
            }
            System.out.println("");  
        } 
        
        for (length=1;length<=10;length++){
            for (space = 9;space >= length;space--){
                System.out.print(' ');
            }
            for (times = 1;times <=length;times++){
                System.out.print('*');
            }
            System.out.println("");  
        }                
    }   
}
