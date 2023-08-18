package 상근이알람;

import java.util.Scanner;

public class AlarmEx1 {
    public static void main(String[] args) {
        // 시간과 분을 입력받기 위한 스캐너 생성
        // 시간과 분을 각각 입력 받음
        // 45분을 빼야 되므로 시간과 분을 총 몇 분인 환산함
        // 계산된 시간이 45분 보다 작으면 하루 전날 이므로 하루의 시간 만큼 더해줌
        // 계산된 시간에서 45를 빼줌
        // 결과를 시간과 분으로 환산해서 출력 해줌
        Scanner sc = new Scanner(System.in);
        int hour;
        int min;

        System.out.print("시간 입력 : ");
        hour = sc.nextInt();
        min = sc.nextInt();
        int totalmin = (hour * 60) + min;
        if (totalmin < 45) {
            totalmin = (24 * 60) + min;
        }
        totalmin -= 45;
        System.out.printf("%d %d\n", (totalmin / 60), (totalmin % 60));

    }
}
