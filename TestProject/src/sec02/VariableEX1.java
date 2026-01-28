package ch02.sec01;
import java.util.Scanner;

public class VariableEX1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String no = sc.nextLine();
//        int year = sc.nextInt();
//        char grade = sc.next().charAt(0);
//        float average = sc.nextFloat();
        String name = "홍길동";
        String no = "2015001";
        int year = 4;
        char grade = 'A';
        float average = 93.5;

        System.out.println("성명 : " + name);
        System.out.println("학번 : " + no);
        System.out.println("학년 : " + year);
        System.out.println("GPA : " + grade);
        System.out.println("평균 : " + average);
    }
}