package 매개변수람다식;

@FunctionalInterface // 함수형 프로그램을 만들기 위해 사용하는 인터페이스 임을 알리기 위한 어노테이션, 내부에 함수가 한개만 존재
interface MyFuncInterface {
    void method(int x);
}

@FunctionalInterface // 리턴값이 있는 람다식
interface MyfuncInterface2 {
    int min (int x, int y);
}


public class LamdaEx1 {
    public static void main(String[] args) {
//        MyFuncInterface fi = x -> { // 구현부가 한줄인 경우는 중괄호 생략 가능, 매개변수가 한개인 경우는 () 생략 가능
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(10);
        MyfuncInterface2 fi2 = (x, y) -> x < y ? x : y; // 구현부가 한줄인 경우 {} 생략 가능 return 생략
        System.out.println(fi2.min(3, 4));
    }
}
