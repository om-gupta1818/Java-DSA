package if_else;

import java.util.Scanner;

public class ternaryVariable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prasun = (n>=0) ? 100 : 0;
        System.out.println(prasun);


    }
}
