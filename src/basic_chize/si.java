package basic_chize;

import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = 67.0;
        int r = 2;
        int t = 3;

        double si = p * r * t / 100;

        System.out.println(si);
    }
}