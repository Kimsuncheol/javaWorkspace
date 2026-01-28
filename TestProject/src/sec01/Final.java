package ch02.sec01;

public class Final {
    static void main() {
//        상수 : final 예약어 사용
//        final 데이터타입 상수명(대문자로 사용);
//        float: 실수 타입 명
//        final int count = 3;
        final float PI = 3.14f;     // 실수 literal 뒤에 put 'f' on 하여 float type임을 알려줘야 함
        double radius = 10.0;       // real number 뒤에 예약 문자 없으면 double type
//        double circleArea = 0.1415f;
        double circleArea = 0;

        circleArea = PI * radius * radius;

        System.out.println("원의 면적 = " + circleArea);
    }
}