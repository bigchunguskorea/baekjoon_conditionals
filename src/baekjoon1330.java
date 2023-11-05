//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
import java.util.Scanner;

public class baekjoon1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        sc.close();

        System.out.println((numA>numB) ? ">" : ((numA<numB) ? "<" : "=="));
    }
}
