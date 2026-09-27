package basic_chize;

import java.util.Scanner;

public class sqofno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;

        System.out.println("Square of " + n + " is: " + square);
    }
}