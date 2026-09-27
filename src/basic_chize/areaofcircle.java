package basic_chize;

import java.util.Scanner;

public class areaofcircle {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        double a = 3.141592 * r * r;

        System.out.println("Area is: " + a);
    }
}
