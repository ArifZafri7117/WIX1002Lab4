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
public class L4Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double p = input.nextDouble();
        System.out.print("Enter interest in % : ");
        double i = input.nextDouble();
        System.out.print("Enter Total Number Of Months : ");
        int months = input.nextInt();
        
        double r = i / (12 * 100);
        double m = (p * r)/(1 - Math.pow(1 + r, - months));
        
        System.out.printf("%-8s%-18s%-14s%-12s%-16s%s%n",
                "Month", "Monthly Payment", "Principal", "Interest",
                "Unpaid Balance", "Total Interest");
 
        double totalInterest = 0;
        for(int n = 1; n <= months;n ++){
            double C = m * Math.pow(1 + r, -1 - months + n);
            double L = m - C;
            double R = L/r - C;
            
            if(n == months) R = 0;
            totalInterest += L;
            
            System.out.printf("%-8d%-18.2f%-14.2f%-12.2f%-16.2f%.2f%n",months, m, C, L, R, totalInterest);     
        }
    }
}
