/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101);      // random n from 0 to 100
        System.out.println("n = " + n);
        System.out.println("The first " + n + " prime number(s):");

        int found = 0;                  // how many primes printed so far
        int num = 2;              // number being tested
        while (found < n) {
            boolean isPrime = true;
            for (int d = 2; d * d <= num; d++) {
                if (num % d == 0) {   // has a divisor, so not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                found++;
            }
            num++;
        }
        System.out.println();
    }
}