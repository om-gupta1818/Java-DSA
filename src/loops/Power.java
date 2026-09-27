package loops;

import java.util.Scanner;

public class Power {
    static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int pow= 1;
        for (int i = 1; i <=b ; i++) {
            pow+= a;
        }
        System.out.println(a+"raised to power "+b+" is"+pow);
    }
}
