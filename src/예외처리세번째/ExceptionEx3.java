package 예외처리세번째;
// NullPointerException (NPE) : Java에서 발생하는 대표적인 런타임 에러입니다. 참조하려는 객체가 없는 경우에 발생 합니다.
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;

        if (test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        } else {
            System.out.println("test null 입니다.");
        }
//        try {
//            String testStr = test.name;
//            System.out.println(testStr);
//        } catch (NullPointerException e) {
//            System.out.println("NPE가 발생 했습니다.");
//        }
    }
}

class Test {
    String name = "곰돌이 사육사";
}