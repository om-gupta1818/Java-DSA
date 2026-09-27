package if_else;

import java.util.Scanner;

public class Greatestodthree {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = sc.nextInt();
        System.out.println("Enter 2st no");
        int b = sc.nextInt();
        System.out.println("Enter 3st no");
        int c = sc.nextInt();

        if(a>=b && a>=c) System.out.println(a);
       else if(b>=c && b>=a) System.out.println(b);
        System.out.println(c);
    }
}
