/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;
import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int firstDay = input.nextInt();

        // February has 29 days in a leap year
        int feb = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;

        // Days from 1 Jan to 1 May, and from 1 Jan to 1 Aug
        int daysToMay = 31 + feb + 31 + 30;
        int daysToAug = daysToMay + 31 + 30 + 31;

        // Weekday of the 1st of each month (May and August both have 31 days)
        int[] start = {(firstDay + daysToMay) % 7, (firstDay + daysToAug) % 7};
        String[] name = {"May", "August"};

        for (int m = 0; m < 2; m++) {
            System.out.println("\n        " + name[m] + " " + year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < start[m]; i++) {
                System.out.print("    ");               // blank cells before the 1st
            }
            for (int d = 1; d <= 31; d++) {
                System.out.printf("%4d", d);
                if ((start[m] + d) % 7 == 0) {
                    System.out.println();               // new line after Saturday
                }
            }
            System.out.println();
        }
    }
}