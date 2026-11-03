/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;
import java.util.Scanner; 

/**
 *
 * @author USER
 */
public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int n = sc.nextInt();
        int sum = 0;
        int total = 0;
        
        for(int i = 1; i<=n; i++){
            sum = sum + i;
            total = total + sum;
        }
        System.out.print("Sum of the Integers : " + total);
        
        }
    
}
