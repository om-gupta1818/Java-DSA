package if_else;

import java.util.Scanner;

public class absteVle {
    static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n  = sb.nextInt();
        if(n>=0) System.out.println(n);
        else System.out.println(-n);


    }
}
