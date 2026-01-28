package ch03.sec01;

public class LogicOp {

	public static void main(String[] args) {
		// 논리연산자는 비교연산자와 같이 사용되는 게 일반적임
        int charCode = 'A';

        System.out.println((charCode >= 65) & (charCode <= 90));
        System.out.println((charCode >= 65) && (charCode <= 90));
        System.out.println(true & true);

        if ((charCode >= 65) & (charCode <= 90)) {      // unicode 65 ~ 90 -> uppercase letter
            System.out.println("uppercase letter");
        }

        if ((charCode >= 97) & (charCode <= 122)) {     // unicode 97 ~ 122 -> lowercase letter
            System.out.println("lowercase letter");
        }

        if (!(charCode < 48) && !(charCode > 57)) {       // unicode 48 ~ 57 -> number
            System.out.println("number");
        }

        int value = 6;
        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("This is a multiple of 2 or 3");
        }

        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("This is a multiple of 2 or 3");
        }
	}

}
