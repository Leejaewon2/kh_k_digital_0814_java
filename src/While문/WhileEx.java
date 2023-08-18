package While문;
/*
주어진 조건이 참인 동안 게속 해당 블록{ }을 반복 수행
주로 반복 횟수를 알 수 없는 경우에 사용.
 */

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위해 스캐너 생성
        System.out.print("정수를 입력 하세요 : ");
        int n = sc.nextInt();
        int sum = 0; // 합계를 구한 변수를 초기화
//        while (n > 0) {
//            sum += n; // sum = sum + n;
//            n--; // 입력 받은 값을 1씩 감소 시킨다.
//        }
        // 초기식;조건식;증강식
//        for(int i = 1; i <= n; i ++) {
//            sum += i;
//        }
//        System.out.println("주어진 정수의 합 : " + sum);
    }
}
