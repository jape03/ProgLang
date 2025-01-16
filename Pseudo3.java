// Java Pseudocode 3

import java.util.*;

public class Pseudo3 {
    public static int GCD(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int n,o,result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        n = input.nextInt();
        o = input.nextInt();

        result = GCD(n, o);
        System.out.println("The GCD of n and o is: " + result);

        input.close();
    }

}
