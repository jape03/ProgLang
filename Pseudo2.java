// Java Pseudocode 2

public class Pseudo2 {
    public static int CalculateSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {

    int i,j,sum;
    i = 15;
    j = 25;

    if (i>j){
        System.out.println("i is greater than j");
    } else{
        sum = CalculateSum(i,j);
        System.out.println("Sum of i and j is: " + sum);
    }
    for (int h = 1; h <= 5; h++ ){
        System.out.println("Value of h is: " + h);
    }
    }
}

