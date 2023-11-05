//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class baekjoon9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        sc.close();

        String scoreStr = "";
        switch (score/10) {
            case 10:
            case 9: scoreStr = "A";
                    break;
            case 8: scoreStr = "B";
                    break;
            case 7: scoreStr = "C";
                    break;
            case 6: scoreStr = "D";
                    break;
            default: scoreStr = "F";
        }
        System.out.println(scoreStr);

        //System.out.println((score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F");
    }
}
