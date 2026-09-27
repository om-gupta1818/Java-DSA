package if_else;

import java.util.Scanner;

public class ternarybasics {
    static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("enter number");
        int n = sb.nextInt();
        //if(n%2 ==) System.out.println("even");
        //else System.out.println("odd");
        System.out.println();
        // condition ? sach : jhoot
        System.out.println((n%2==0) ? "even" : "odd");
    }
}
