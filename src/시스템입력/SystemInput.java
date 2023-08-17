package 시스템입력;
// Scanner : 클래스를 사용해서 입력 받음
import java.util.Scanner;

public class SystemInput {
    public static void main(String[] args) {
        /*
        // 클래스는 설계 도면이라고 생각하면 됨
        // sc는 클래스에 대한 변수
        Scanner sc = new Scanner(System.in); // 스캐너에 대한 객체 생성
        byte a = sc.nextByte(); // byte 형 입력을 받아 반환
        short b = sc.nextShort(); // short 형 입력을 받아 반환
        int c = sc.nextInt(); // int형 입력을 받아 반환
        long d = sc.nextLong(); // long 형 입력을 받아 반환
        char ch = sc.next().charAt(0); // 문자열에서 0번째(첫번째) 문자를 추출
        float e = sc.nextFloat(); // float 형 입력을 받아 반환
        double f = sc.nextDouble(); // double 형 입력을 받아 반환
        String h = sc.next(); // 공백 기준으로 반환
        String i = sc.nextLine(); // 줄바꿈 문자 기준
        */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("이름을 입력 하세요 : ");
//        String name = sc.next(); // 이름을 입력 받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어 감
//        sc.nextLine(); // 버퍼 비우기
//        System.out.print("주소를 입력 하세요 : ");
//        String addr = sc.nextLine(); // 줄바꿈이 일어나면 다음 입력으로 넘어감
//        System.out.print("성별을 입력 하세요 : ");
//        char gender = sc.next().charAt(0); // 입력 받은 문자열에서 맨앞의 문자 1차 추출
//        System.out.print("나이를 입력 하세요 : ");
//        int age = sc.nextInt();
//
//        System.out.println("==== 회원 정보 출력 ====");
//        System.out.println("이름 : " + name);
//        System.out.println("주소 : " + addr);
//        System.out.println("성별 : " + gender);
//        System.out.println("나이 : " + age);

        Scanner sc = new Scanner(System.in);
        System.out.print("닉네임을 입력 하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("랭크를 입력 하세요 : ");
        String rank = sc.nextLine();
        System.out.print("라인을 입력 하세요 : ");
        String line = sc.nextLine();

        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("닉네임 : " + name);
        System.out.println("랭크 : " + rank);
        System.out.println("라인 : " + line);



    }
}
