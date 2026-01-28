package ch03.sec01;
import java.util.Scanner;

public class CompareOp2 {

	public static void main(String[] args) {
		// 문자열 비교
        Scanner sc = new Scanner(System.in);

        String pass = "1234";   // 이 참조 주소와
        String userPass;        // 이 변수의 참조 주소는 다름

        System.out.println("비밀번호 입력: ");
        userPass = sc.nextLine();

        if (pass == userPass) {     // 두 변수가 참조하는 주소가 같은가? 두 instances가 다르므로 address가 다름
            System.out.println("PASS");
        } else {
            System.out.println("No PASS");
        }

        if (pass.equals(userPass)) {    // 두 객체 참조하는 값이 같은지
            System.out.println("PASS");
        } else {
            System.out.println("No PASS");
        }

        sc.close();
	}

}
