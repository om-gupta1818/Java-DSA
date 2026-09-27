package if_else;

import java.util.Scanner;

public class profitandloss {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cp:");
        int cp = sc.nextInt();
        System.out.println("enter sp");
        int sp = sc.nextInt();


        if(sp>cp) System.out.println("Profit"+(sp-cp));
        else System.out.println("Loss"+(cp-sp));





    }
}
