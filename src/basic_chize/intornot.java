package basic_chize;

import java.util.Scanner;

public class intornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        double n = sc.nextDouble();

        if (n == (int)n) {
            System.out.println("is an integer");
        } else {
            System.out.println("is not an integer");
        }
    }
}