import java.util.Scanner;
import java.lang.Math;

public class baekjoon2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        sc.close();

        //System.out.println(Math.abs(num2-num1));
        if (num1 > num2)
            System.out.println(num1-num2);
        else
            System.out.println(-num1+num2);
    }
}
