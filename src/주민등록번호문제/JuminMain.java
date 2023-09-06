package 주민등록번호문제;

import java.util.Calendar;
import java.util.Scanner;

// 주민번호를 입력 받아서 생년월일, 성별, 나이 출력 하기
public class JuminMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar now = Calendar.getInstance();
        int thisYear = now.get(Calendar.YEAR);
        int intYear = 0;
        int intMonth = 0;
        int intDay = 0;
        int intGender = 0;

        System.out.print("주민등록번호를 입력 하세요 : ");
        String jumin = sc.next();

        for(int i =  0; i < jumin.length(); i++) {
            if (i == 0) intYear = (jumin.charAt(0) - '0') * 10;
            if (i == 1) intYear += jumin.charAt(1) - '0';
            if (i == 2) intMonth = (jumin.charAt(2) - '0') * 10;
            if (i == 3) intMonth += jumin.charAt(3) - '0';
            if (i == 4) intDay = (jumin.charAt(2) - '0') * 10;
            if (i == 5) intDay += jumin.charAt(3) - '0';
            if (i == 7) intGender = jumin.charAt(7) - '0';
        }

        if(intGender == 1 || intGender == 2) {
            System.out.println("생년월일 : " + (intYear + 1900) +"년" + intMonth + "월" + intDay + "일");
            System.out.println("나이 :  만 " + (thisYear - 1900 - intYear) + "세");
        } else {
            System.out.println("생년월일 : " + (intYear + 2000) +"년" + intMonth + "월" + intDay + "일");
            System.out.println("나이 :  만 " + (thisYear - 2000 - intYear) + "세");
        }

        String[] genderStr = {"", "남성", "여성", "남성", "여성"};
        System.out.println("성별 : " + genderStr[intGender]);

    }
}


