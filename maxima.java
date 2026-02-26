import java.util.Scanner;

public class maxima {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];

        for(int i = 0; i < 5; i++) {
            number[i] = sc.nextInt();
        }

        int max = number[0];

        for(int i = 1; i < 5; i++) {
            if(max < number[i]) {
                max = number[i];
            }
        }

        System.out.println("Max = " + max);
        sc.close();
    }
}
//input: 5 10 15 20 25  // input gola opore nice diba
//Output: 25