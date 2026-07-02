/*
    Fibonacci Sequence developed using Java and Programming logic.
    Author: Rafael A. Queiroz
    Date: 02/Jul/2026
 */

import java.util.Scanner;

public class LogicOfTheFibonacciSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int previous = 0;
        int current = 1;
        int next = 0;
        int x = 0;
        int aux = 0;

        System.out.print("Enter how many numbers you want to see of Fibonacci sequence: ");
        x = sc.nextInt();

        System.out.print(previous);
        aux = x;
        while ((x-1) > 0) {
            if (aux == x) {
                System.out.print(", " + current);
                x--;
            } else {
                next = current + previous;
                System.out.print(", " + next);
                previous = current;
                current = next;
                x--;
            }
        }
        System.out.println();

        sc.close();
    }
}
