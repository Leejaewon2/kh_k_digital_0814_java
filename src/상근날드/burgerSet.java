package 상근날드;
/*
상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다.
주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의
합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
 햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.

입력
입력은 총 다섯 줄이다. 첫째 줄에는 상덕버거, 둘째 줄에는 중덕버거, 셋째 줄에는 하덕버거의 가격이 주어진다.
넷째 줄에는 콜라의 가격, 다섯째 줄에는 사이다의 가격이 주어진다. 모든 가격은 100원 이상, 2000원 이하이다.

출력
첫째 줄에 가장 싼 세트 메뉴의 가격을 출력한다.

예제 입력 1
800
700
900
198
330

예제 입력 2
848
 */



import java.util.Scanner;

public class burgerSet {
    public static void main(String[] args) {
        // 5개의 값을 입력 받기 위해 배열 생성
        int[] menu = new int[5];
        // 키보드 입력을 받기 위해 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int minBerger = menu[0]; // 햄버거 중에 제일 싼 메뉴를 찾기 위해 시작 값
        int minDrink = menu[3]; // 음료 중 제일 싼 메뉴를 찾기 위한 시작 값
        for (int i = 0; i < menu.length; i++) {
            if (i < 3 && minBerger > menu[i]) minBerger = menu[i];
            if (i > 2 && minDrink > menu[i]) minDrink = menu[i];
        }
        System.out.println(minBerger + minDrink -50);

    }
}
