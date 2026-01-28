package ch04.sec02;

public class For {

	public static void main(String[] args) {
		// For 문 예제
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // accumulation operator

        int sum, i;
        sum = 0;
        for (i = 1; i <= 100; i++) {    // 반복 종료되는 시점의 i값은 조건이 false여야 하므로 100보다 커야 한다. : 101
            sum += i;
        }
        System.out.println("1~" + (i - 1) + "합 : " + sum);

        // 증가감 표현 변경
        sum = 0;
        for (i = 1; i <= 100; i+=2) {
            sum += i;
        }
        System.out.println("1~" + (i - 1) + "의 홀수합 : " + sum);

        //////////////////////////////////////////////////////
        /// nested for
        ///  multiplcation table

        for (int m = 2; m <= 9; m++) {
            System.out.println("***" + m + "단 ***");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " * " + n + " = " + (m * n));
            }
        }
    }
}
