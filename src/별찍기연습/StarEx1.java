package 별찍기연습;

/*
1. 삼각형 별찍기
2. 입력 받은 수 만큼 별찍기 : 아래는 5를 입력 했을 때
*
* *
* * *
* * * *
* * * * *
        for (int i = 0; i < 10; i++) {
            System.out.printf("|i=%d|", i);
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
 */



import java.util.Scanner;

public class StarEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("별 개수 : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
//            System.out.println();
        }




    }
}
