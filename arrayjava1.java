import java.util.Scanner;

public class arrayjava1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] number = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            number[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++) {
            sum = sum + number[i];
        }

        System.out.println("Sum = " + sum);   // Output added
        input.close();                        // Good practice
    }
}

//5
//1 2 3 4 5
//Output: Sum = 15