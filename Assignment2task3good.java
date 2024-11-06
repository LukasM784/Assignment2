/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2task3good;
import java.util.Scanner;
public class Assignment2task3good {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        while(true){
            System.out.print("Enter a product number(1-5 or 0 to stop): ");
            int productnum = input.nextInt();
            if (productnum == 0){
                break;
            }  
            double price = 0;
            switch(productnum){
                case 1 -> price = 2.98;
                case 2 -> price = 4.50;
                case 3 -> price = 9.98;
                case 4 -> price = 4.49;
                case 5 -> price = 6.87;
            }
            System.out.print("Enter quantity sold:");   
            int quantitysold = input.nextInt(); 
            total += price*quantitysold;  
        }
        System.out.println("Total retail value of all products sold is: $" + total);
    }
}
