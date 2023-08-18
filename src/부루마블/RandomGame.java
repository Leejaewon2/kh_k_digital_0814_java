package 부루마블;
// 두개의 주사위를 던져 12가 나오면 탈출하는 게임
public class RandomGame {
    public static void main(String[] args) {
        int random1, random2;
        int cnt = 0; // 몇번만에 탈출 했는지 숫자 세기
        while (true) {
            cnt++;
            random1 = (int) ((Math.random() * 6) + 1); // random 함수는 0 이상 1 미만의 실수값을 반환하기때문에 +1 더해줘야함.
            random2 = (int) ((Math.random() * 6) + 1);
            if ((random1 + random2) == 12) {
                System.out.printf("무인도를 %d번 만에 탈출 했습니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (random1 + random2) + "입니다.");
            }
        }
    }
}
