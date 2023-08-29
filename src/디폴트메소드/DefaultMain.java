package 디폴트메소드;

import java.util.Scanner;

public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]TV, [2]Audio : ");
        int selectMenu = sc.nextInt();
        RemoteControl remoCon;
        if(selectMenu == 1) {
            remoCon = new Television();
            remoCon.turnON();
            remoCon.setVolume(20);
            remoCon.setMute(true);
            // 인터페이스 소속의 static 메소드
            RemoteControl.changeBattery();
        } else {
            remoCon = new Audio();
            remoCon.turnON();
            remoCon.setVolume(30);
            remoCon.setMute(true);
        }
        RemoteControl ps5 = new RemoteControl() {
            @Override
            public void turnON() {
                System.out.println("플스5 켭니다.");
            }

            @Override
            public void turnOFF() {
                System.out.println("플스5 끕니다.");
            }

            @Override
            public void setVolume(int volume) {

            }
        };
        ps5.turnON();
        ps5.turnOFF();
    }
}
