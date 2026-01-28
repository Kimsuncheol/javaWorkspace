package ch02.sec01;

public class Literal {
    public static void main() {
//        literal -> 실제 값 총칭(저장되는 값의 유형을 총칭)
//        정수 / 실수 / 문자(char) / 문자열(String) / 논리
        int score = 95;
        double average = 88.5;
        char familyName = '김';  // 문자 리터럴 : ''
        String name = "홍길동";    // String
        boolean result = true;

        System.out.println(score);
        System.out.println(average);
        System.out.println(familyName);
        System.out.println(name);
        System.out.println(result);

        // 변수 사용 범위 : {} 선언된 변수의 가장 가까운 within block에서만 사용 가능
    }
}