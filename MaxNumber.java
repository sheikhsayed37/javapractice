import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first value: ");
        int a = sc.nextInt();

        System.out.print("Input second value: ");
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println("Maximum number is: " + a);
        }
        else if(b > a)
        {
            System.out.println("Maximum number is: " + b);
        }
        else
        {
            System.out.println("Numbers are equal");
        }

    }
}