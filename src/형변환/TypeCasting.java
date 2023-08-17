package 형변환;
// 형변환 이란 : 하나의 데이터 타입을 다른 타입으로 변환 하는 것
// 명시적 형변환 : 개발자가 의도를 가지고 형변환을 하는 것
// 묵시적 형변환 : 컴파일러가 자동으로 해주는 것
public class TypeCasting {
    public static void main(String[] args) {
        int num1 = 1, num2 = 4;
//        double result1 = num1 / num2;  // 형변환이 안일어남, num1, num2가 int 즉 정수로 표현되어있으므로 num1 / num2 = 0.25 값이 나와도 0.0으로 표현됨
//        double result2 = (double) num1 / num2; // 명시적, 묵시적 형변환이 일어남, num1, 2 를 실수로 바꿔줬으므로 0.25로 나옴

        String kor = "90";
        Integer.parseInt(kor);
//        Integer.parseInt(test);  문자열을 정수 int 타입으로 변환 합니다.
//        int kor = 90;
        int mat = 88;
        int eng = 55;
        int total = Integer.parseInt(kor) + mat + eng; // 총점
        double avg = (double)total / 3;


        System.out.println("평균은" + avg + "점 입니다.");
    }
}
