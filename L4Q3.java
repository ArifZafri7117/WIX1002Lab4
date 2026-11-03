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

public class L4Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double sum = 0, sumSquares = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            int score = input.nextInt();
            if (score < 0) break;

            count++;
            sum += score;
            sumSquares += (double) score * score;
            if (score < min) min = score;
            if (score > max) max = score;
        }

        if (count == 0) {
            System.out.println("No scores were entered.");
            return;
        }

        double average = sum / count;
        double variance = count > 1
                ? (sumSquares - (sum * sum) / count) / (count - 1)
                : 0;
        double sd = Math.sqrt(variance);

        System.out.println(variance);   // the sample output also prints this value (1095.0)
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Standard Deviation: %.2f%n", sd);
    }
}