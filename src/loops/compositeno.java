package loops;

import java.util.Scanner;

public class compositeno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <=n-1 ; i++) {
            if(n%i == 0){
               flag  = false;
                break;

            }
            
        }
        if (n==1) System.out.println("neither prime or composite");
       else if(flag==false) System.out.println("Composite no:");
        else if(flag==true) System.out.println("Prime number");
    }
    
}
