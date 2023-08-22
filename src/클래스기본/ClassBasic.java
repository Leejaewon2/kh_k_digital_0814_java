package 클래스기본;

public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student(); // s1은 Student Class에 대한 참조 변수이며 new 를 쓰면 새로운 메모리공간에 할당한다는 의미 (heap)
        s1.setName("곰돌이 사육사");
        s1.setAddr("경기도 수원시");
        s1.showInfo();
        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");
        s2.showInfo();
        Student s3 = new Student();
        s3.setName("유나");
        s3.setAddr("수원시 팔달구");
        s3.showInfo();



    }
}
