package 저항값구하기;
/*
저항값 구하기 : 컬러 문자열 개를 입력 받음
첫번째 컬러 문자열은 10의 자리 수
두번째 컬러 문자열은 1의 자리 수
세번째 컬러 문자열은 곱하는 수
 */
import java.util.Scanner;

public class OhmMainEx {
    public static void main(String[] args) {
        String [] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int frtcolor = 0, seccolor = 0, thdcolor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("컬러 입력 : ");
        String color1 = sc.nextLine();
        System.out.print("컬러 입력 : ");
        String color2 = sc.nextLine();
        System.out.print("컬러 입력 : ");
        String color3 = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            if (color1.equals(color[i])) frtcolor = i; // 첫번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (10의 자리)
            if (color2.equals(color[i])) seccolor = i; // 두번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (1의 자리)
            if (color3.equals(color[i])) thdcolor = i; // 세번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (곱하는 수)
        }
        System.out.println("저항값은 " + (long)((frtcolor * 10) + seccolor) * (long)Math.pow(10, thdcolor) + " 입니다.");
        // Math = 거듭제곱 구하기
    }
}
