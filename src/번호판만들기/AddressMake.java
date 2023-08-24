package 번호판만들기;

import java.util.Scanner;

/*
재석이는 대문에 붙이는 (주소를 나타내는) 호수판 제작업체의 직원이다. 고객에게 전달할 호수판은
숫자와 숫자 사이 그리고 왼쪽 오른쪽으로 적당히 여백이 들어가 줘야하고 숫자마다 차지하는 간격이
조금씩 상이하다. 다행이도 규칙은 매우 간단하다.

1. 각 숫자 사이에는 1cm의 여백이 들어가야한다.
2. 1은 2cm의 너비를 차지해야한다. 0은 4cm의 너비를 차지해야한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
3. 호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.

숫자를 입력
해당 숫자의 몇 칸을 차지하는 지를 출력하는 문제
0을 입력하면 종료
 */

public class AddressMake {
    public static void main(String[] args) {
        int[] numSize = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0; // 입력 받은 수가 차지하는 총 자리수
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        while (true) {
            String number = sc.next();
            if (number.equals("0")) break; // 0이 입력 되면 종료
            for (int i = 0; i < number.length(); i++) {
                sum += numSize[number.charAt(i) - '0'] +1; // 뒤에 1을 더하는 이유는 1을 더하는 각 숫자마다 여백이 1칸생김
            }
            System.out.println(sum +1); // 1을 더하는 이유는 처음 공백을 더해 주는 것
            sum = 0; // 다음 계산을 위해 sum 변수를 초기화 함.
        }


    }
}
