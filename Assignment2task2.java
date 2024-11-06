/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2task2;

public class Assignment2task2 {

    public static void main(String[] args) {
        int side1;
        int side2;
        int hyp;
        int max = 500;
        System.out.printf("%-15s%-15s%s","Side 1","Side 2","Hypotenuse\n");
        for (side1 = 1; side1 <= max; side1++){
            for (side2 = 1; side2 <= max; side2++){
                for (hyp = 1; hyp <= max; hyp++){
                    double sumside = Math.pow(side1,2) + Math.pow(side2,2);
                    double hypsum = Math.pow(hyp,2);
                    if (sumside == hypsum){
                        System.out.printf("%-15d%-15d%d\n",side1,side2,hyp);
                    }
                }
                    
            }
        }
  
    }
    
}
