package 대소문자바꾸기;
/*
영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로
바꾸어 출력하는 프로그램을 작성하시오.
입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
출력
첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를
출력한다.

힌트
charAt(Index) : 문자열에 해당 인덱스 문자를 추출
toCharArray() : 문자열을 문자 배열로 변환
 */


import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        /*
        1. 스캐너 생성
        2. 문자열 입력 받음
        3. 문자열 길이 만큼 순회 하면서 문자에 대한 ASCII값 확인해서 대문자, 소문자 인지
           확인하고 계산해줌
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요 : ");
        String text =sc.next();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch < 'a') System.out.print((char) (ch + ('a' - 'A')));
            else System.out.print((char)(ch - ('a' - 'A')));
        }
    }
}
