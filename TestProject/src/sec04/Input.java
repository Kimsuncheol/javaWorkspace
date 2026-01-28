package ch02.sec04;

// Scanner 클래스 사용하기 위해 import(클래스 밖에서 import) : java.util.Scanner
// import 클래스패키지명.클래스명
import  java.util.Scanner;
public class Input {
    public static void main(String[] args) {

        // 참조형 변수 sc : 참조형 변수(인스턴스) 선언시 활용 객체 타입으로 선언
        Scanner sc = new Scanner(System.in);    // 키보드를 통해 입력된 byte code를 method에 따라 형변환된 결괏값 return
        int num1, num2;
        // 사용자가 입력 후 enter 넣을 때까지 wait
        sc.nextInt();
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("두 수의 곱은 : " + (num1 * num2));

        ///////////////////////////////////////////////////
        /// 문자열 입력 : sc.next()

        String grade;
        System.out.println("문자열을 입력하세요");
        grade = sc.next();
        System.out.println(grade);

        char grd;
        System.out.println("문자를 입력하세요");
        // grd = sc.next(); // 한 문자던 여러 문자던 상관없이 문자열 타입으로 반환 -> char에 저장 불가능
        // 문자열로 입력받은 후에 한 문자만 추출: String.chatAt(0): 첫번째 문자 추출 char 반환
        grd = sc.next().charAt(0);
        System.out.println(grd);
    }
}

