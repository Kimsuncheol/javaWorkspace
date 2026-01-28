package ch03.sec02;

public class BitShiftEx {

	public static void main(String[] args) {
		// bit shift operator: >>, >>>, <<

        // 밀려난 왼쪽 3 bits는 버려지고 오른쪽 3bits는 0으로 채워짐
        System.out.println("1 << 3" + (1 << 3));
        // 밀려난 오른 3 bits는 버려지고 왼쪽 3bits는 최상위 비트로 채워짐
        System.out.println("8 >> 3" + (1 >> 3));
        // 밀려난 오른쪽 3 bits는 버려지고 왼쪽 3bits는 최상위 비트로 채워짐
        System.out.println("-8 >> 3" + (-8 >> 3));
        // 밀려난 왼쪽 3 bits는 버려지고 오른쪽 3bits는 0으로 채워짐
        System.out.println("-8 >>> 3" + (-8 >>> 3));
	}

}
