package 연습문제;
/*
성적 조건문
시험 성적을 입력 받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지는 F를 출력하는 프로그램

 */


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        1. 입력을 위한 스캐너 생성
        2. 입력을 받아서 정수형 변수에 대입
        3. 조건문을 만드는데 우선. 0 ~ 100 사이의 정상적인 입력인지 확인
        4. 정상적인 입력이었다면 각각의 성적 구간에 따라 학점 출력
         */
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("시험성적 : ");
            int score = sc.nextInt();
            if (score >= 0 && a <= 100) ;
            if (score >= 90) System.out.println("A");
            else if (score >= 80) System.out.println("B");
            else if (score >= 70) System.out.println("C");
            else if (score >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
    }
}
