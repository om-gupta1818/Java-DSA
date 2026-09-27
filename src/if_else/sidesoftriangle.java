package if_else;

import java.util.Scanner;

public class sidesoftriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st side");
        int a = sc.nextInt();
        System.out.println("enter 2st side");
        int b = sc.nextInt();
        System.out.println("enter 3st side");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b)
            System.out.println("Valid triangle");
        else System.out.println("invalid triangle");
    }

}
