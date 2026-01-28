package sec02;

public class DataType {
	public static void main(String[] args) {
		// DataType
		// 기본타입 8개(정수/실수/문자/논리)
		// 정수 타입 : byte / short / int / long
		// 실수 타입 : float / double
		// 문자 타입 : char
		// 논리 타입 : boolean
		// 데이터 타입에 다라 사용하는 메모리 크기가 다름
		// 메모리 크기 최소 단위 : bit (0 or 1)
		// bit가 8개가 모여서 byte 단위 : 8개의 0 또는 1을 저장함
		// byte: 데이터를 처리하는 최소 단위 -> 256개의 데이터 표


        ////////////////////////////////////////////////////////////////////////
        ///  int - 4byte 정수 값을 표현
        ///  정수의 기본 타입
        
        int num = 10;   // 리터럴에 정수 표현 기호가 필요 없음

        /// long : 8byte 정수 값을 표현

        long num2 = 10;     // int 타입의 리터럴을 long형 변수에 저장(작은 타입이 큰 타입으로 저장)
//        long longValue = 100010001000100; // 리터럴 int형인데 표현범위 벗아남 -> 오류 발생
        long longValue = 100010001000100l;  // L, l을 표현해서 long형 리터럴임을 알려야 함

        System.out.println("==============================");
        byte byteValue = 10;        // 1byte 정수 00000110
        short shortValue = 1000;    // 2byte 정수
        int intValue = 2100100100;  // 4byte 정수
        long longVal = 100010001000100l;

        System.out.println(byteValue);

        ////////////////////////////////////////////////////////////////////////
        ///  실수타입
        ///  float : 리터럴 사용시 f 기호 추가
        ///  double : 실수의 기본 타입
        ///

        float average = 88.5f;
        double doubleValue = 0.1234567890123456789;
        float floatValue = 0.1234567890123456789f;

        System.out.println("==============================");
        System.out.println(doubleValue);
        System.out.println(floatValue);

        ////////////////////////////////////////////////////////////////////////
        ///  지수 표현 하기
        ///  e 기호 사용
        ///  가수부e지수부
        ///

        int var1 = 3000000;
        double var2 = 3e6;      // 정수 부분을 표현하고 e6을 표현: 0을 6개 추가 3000000
        float var3 = 3e6f;      // f는 float의 f
        double var4 = 3e-6;     // 소수점 이하 6자리
        double var4 = 3e-2;     // 소수점 이하 2자리

        System.out.println("==============================");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        // 참조형(기본 타입만으로 표현이 어려워서 추가된 타입(객체) : String
        // 기본타입인 것처럼 사용되지만 참조타입임
        String name = "홍길동";
	}
}
