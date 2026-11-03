/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;
import java.util.Random;
/**
 *
 * @author USER
 */
public class L4Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(Integer.MAX_VALUE);
        
        int digits = 0;
        int temp = number;
        do{
            digits++;
            temp /= 10;
        }
        while(temp > 0);
                System.out.println("Random Integer : " + number);
                System.out.println("Digits in the integer : " + digits);
    }
}
