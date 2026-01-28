package ch03.sec01;

public class IncreaseOp {

	public static void main(String[] args) {
		// 증가감 연산자
        int x = 10;
        int y = 10;
        int z;

        // 증가감연산자 단독 사용 : 위치 상관 없음
        System.out.println("-------------------------------");


        // 대입연산자 단독 사용 : 위치 상관 없음
        System.out.println("-------------------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        // 대입연산자와 같이 사용
        System.out.println("-------------------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        // 다른 연산자와 같이 사용(+ 연산과 같이 사용)
        System.out.println("-------------------------------");
        z = ++x y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
