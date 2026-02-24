import java.util.Scanner;
import java.io.File;
public class javasumofdigits
 {
    public static void main(String[] args)
    {
       Scanner input =new Scanner(System.in);
      int sum=0;
      int num,r,temp;
      num=input.nextInt();
      temp=num;
     while(temp!=0)
     {
        r=temp%10;
        sum=sum+r;
        temp=temp/10;

     }
     System.out.println("SUM OF DIGITS :" +sum);

    }
}
