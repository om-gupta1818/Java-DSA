package if_else;

import java.util.Scanner;

class oddeven {
    static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sb.nextInt();
        if(n%2==0)
            System.out.println("even number");
        else{
            System.out.println("odd number");

        }
    }
}

