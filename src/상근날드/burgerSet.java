package 상근날드;

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
