package X보다작은수;
/*
정수 N개로 이루어진 배열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두
출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나
같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어
도 하나 존재한다.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XLessNumber {
    public static void main(String[] args) {
        // ================================== 내가 푼거=================
//        Scanner sc = new Scanner(System.in);
//        System.out.print("값 입력 : ");
//
//        int n = sc.nextInt(); // 배열의 크기
//        int x = sc.nextInt(); // 기준 값 x
//
//        int[] a = new int[n]; // 배열 a 생성
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt(); // 배열 a의 원소 입력
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i] < x) {
//                System.out.print(a[i] + " ");
//            }
//
//        }
        // ================================== 내가 푼거=================
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 크기를 비교하는 기준 값 (미만 값을 찾음)
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 리스트에 값을 추가 함
            if (list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
