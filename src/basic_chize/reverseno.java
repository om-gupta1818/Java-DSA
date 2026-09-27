package basic_chize;

import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no:");
        int num = sc.nextInt();

        int reverse = 0, sum = 0, temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Reverse = " + reverse);
        System.out.println("Sum = " + sum);
    }
}