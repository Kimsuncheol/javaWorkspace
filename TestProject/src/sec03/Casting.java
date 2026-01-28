package sec03;

public class Casting {
	public static void main(String[] args) {
		// 강제 형변환 (Casting)
		// (형변환타입)리터럴, (형변환)변수명
		// ()형변환 연산자에 의해 일시적 형변환
		int intValue = 44032;	// 문자 '가'의 Unicode
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;      // int형으로 명시적 형변환
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int)doubleValue;    // 명시적 형변환
        System.out.println(intValue);   // 소수점 이하 버림(double형을 정수)
	}
}
