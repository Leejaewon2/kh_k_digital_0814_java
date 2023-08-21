package 문자열다루기;

import java.util.Locale;

// 자바는 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형 입니다.
// equals : 두개의 문자열이 동일한지 비교하여 결과값을 리턴함 (true / false) == 문자열 주소가 같은지를 물어봄
// indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
// contains : 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
// charAt : 문자열에서 특정 위치의 문자를 반환
// replaceAll : 문자열 중에서 특정 문자열을 다른 문자열로 변경 (문자열 + 정규식, 변경), (regex), (삭제할때도 사용)
// replace : 문자열만 교체 하는것 (target), (삭제할때도 사용)
// substring : 문자열 중 특정 부분을 뽑아 낼 때 사용 (시작 인덱스만 주는 경우와 시작과 끝을 주는 경우가 있음)
// toUpperCase / toLowerCase : 문자열 전부를 대문자 / 소문자 변경하는 메소드
// trim : 문자열 앞뒤의 공백을 잘라냄
// split : 문자열을 특정 구분자로 분리하는 메소드이다.
// toCharArray() : 문자열을 문자 배열로 반환 합니다.
public class StringMethod {
    public static void main(String[] args) {
        String a = "hello java";
        String b = "java";
        String c = "Hello";
        String d = new String("hello");

        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c)); // 문자열을 비교하는데 대소문자 구분 안함
        System.out.println(a.indexOf("lt")); // 문자가 시작되는 인덱스 반환
        System.out.println(a.contains("java"));
        System.out.println(a.charAt(4));
        String e = "Hello Java";
        System.out.println(e.replace("Java", ""));
        System.out.println(e.substring(4, 7));
        System.out.println(e.toUpperCase()); // 대문자
        System.out.println(e.toLowerCase()); // 소문자
        String oldStr = "    자바 프로그래밍    ";
        System.out.println(oldStr.trim());
        String time = "10:23:45";
        String [] modifyTime = time.split(":");
        for (String  eee : modifyTime) System.out.print(eee + " ");
        System.out.println();

        // 문자열 포맷팅을 출력을 위해서 사용
        System.out.printf("I eat %d apples.\n", 3);

        String test = String.format("I eat %d apples.", 3);

        System.out.println(test);

        String testname = "James";
        char[] chName = testname.toCharArray();
        for (char ech : chName) System.out.print(ech + " ");

    }
}
