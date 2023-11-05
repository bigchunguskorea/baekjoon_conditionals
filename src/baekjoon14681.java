//흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
import java.util.Scanner;

public class baekjoon14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x_val = sc.nextInt();
        int y_val = sc.nextInt();
        sc.close();

        int quadrant = 0;
        if (x_val >= 0 && y_val >= 0)
            quadrant = 1;
        else if (x_val < 0 && y_val >=0)
            quadrant = 2;
        else if (x_val < 0)
            quadrant = 3;
        else
            quadrant = 4;

/*
        if (x_val > 0)
            if (y_val > 0)
                quadrant = 1;
            else
                quadrant = 4;
        else
            if (y_val > 0)
                quadrant = 2;
            else
                quadrant = 3;
*/
        System.out.println(quadrant);
    }
}
