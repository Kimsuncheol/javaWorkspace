package ch03.sec01;
import java.util.*;

public class TimeCalculation {

	public static void main(String[] args) {
		// Enter the seconds from your input
        Scanner sc = new Scanner(System.in);

        System.out.print("시간 입력 (초) : ");
        int inputSec = sc.nextInt();

        if (inputSec < 0 || Integer.MAX_VALUE) {
            System.out.println("Wrong Input");
        } else {
            int hours = inputSec / 3600;
            int minutes = inputSec % 3600 / 60;
            int seconds = inputSec % 60;
            System.out.println(inputSec + "초는 " + hours + "시간, " + minutes + "분, " + seconds + "초입니다.");
        }

        sc.close();
	}
}
