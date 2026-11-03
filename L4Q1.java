/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

/**
 *
 * @author USER
 */
import java.util.Scanner;

 public class L4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter an Integer : ");
        number = input.nextInt();
        System.out.print("The factors are : ");

        for(int i = 1; i <= number; i++){
            if(number%i==0){
                System.out.print(i);
                if(number != i)
                    System.out.print(" , ");
              }
       }
}
 }