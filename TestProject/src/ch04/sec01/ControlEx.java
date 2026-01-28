package ch04.sec01;
import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("******* 상품 정보 *******");
        System.out.println("1. laptop: KRW 1,200,000");
        System.out.println("2. Digital camera: KRW 400,000");
        System.out.println("***********************");
        System.out.print("상품번호 입력 : ");

		int productNumber = sc.nextInt();
        int ThePriceOfLaptop = 1200000;
        int ThePriceOfDigitalCamera = 400000;
        int totalPrice = 0;
        int orderAmount = 0;

        if (productNumber < 1 || productNumber > 2) {
            System.out.println("Invalid value. Program terminated.");
        } else {
            System.out.print("주문 수량 입력 : ");
            int productQuantity = sc.nextInt();
            System.out.println("******* order details *******");
            System.out.print("상품명 : ");
            switch (productNumber) {
                case 1:
                    orderAmount = ThePriceOfLaptop * productQuantity;
                    System.out.println("laptop");
                    break;
                    case 2:
                        orderAmount = ThePriceOfDigitalCamera * productQuantity;
                        System.out.println("Digital camera");
                        break;
                        default:
                            System.out.println("Invalid value. Program terminated.");
            }
            System.out.println("주문 수량 : " + productQuantity + "개");
            System.out.println("주문액 : " + orderAmount + "원");
            if (orderAmount >= 1000000) {
                System.out.println("할인액 : " + orderAmount * 0.1);
                totalPrice = orderAmount * 0.9;
            } else if (orderAmount >= 500000) {
                System.out.println("할인액 : " + orderAmount * 0.05);
                totalPrice = orderAmount * 0.95;
            } else {
                totalPrice = orderAmount;
            }
            System.out.println("총지불액 : " + totalPrice);
        }
        sc.close();
	}
}
