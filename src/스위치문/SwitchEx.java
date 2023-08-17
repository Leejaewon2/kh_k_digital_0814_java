package 스위치문;

import java.util.Scanner;

// 조건에 조건식이 올 수 없고, 조건의 값이 와야 한다.
// 조건값에는 정수, 문자, 문자열이 올 수 있다, (값이 정확해야 해서 실수값은 올 수가 없음)
// 장점 : if문에 비해서 가독성이 좋다., 성능이 약간 좋다.
// 단점 : 조건식이나 범위가 올 수 없다.
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력 하세요. : ");
        String season = sc.next();
        switch (season) {
            case "spring" :
            case "SPRING" :
                System.out.println("꽃이 피는 봄이 왔어요");
                break;
            case "summer" :
                System.out.println("무더운 여름 입니다.");
                break;
            case "fall" :
            case "autumn" :
                System.out.println("천고마비의 가을 입니다.");
                break;
            case "winter" :
                System.out.println("아직 겨울이네요ㅠㅠ");
                break;
            default:
                System.out.println("계절을 잘 못 입력 했습니다.");
        }

    }
}
