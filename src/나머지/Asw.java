package 나머지;
/*
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으
로 나눈 나머지는 1, 2, 0, 2이다.
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지
출력하는 프로그램을 작성하시오.

입력
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같
고, 음이 아닌 정수이다.

출력
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

10개의 수를 입력 받은 뒤, 이를 42로 나눈 나머지를 구함
나머지를 구한 다음 서로 다른 값이 몇개 인지 구하는 문제
숫자 10개를 연속으로 입력 받음
 */

import java.util.Scanner;

public class Asw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[42];
        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 숫자
        int input;   // 입력 받은 값
        System.out.print("10개의 수 입력 : ");
        for (int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1; // 입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for (int val : arr) cnt += val;
        System.out.println(cnt);


    }
}
