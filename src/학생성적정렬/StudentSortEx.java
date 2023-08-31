package 학생성적정렬;

import java.util.TreeSet;

/*
미리 입력 받아 놓고 시작
5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 성적이
같으면 이름순 정렬
 */
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> list = new TreeSet<>();
        list.add(new Student("이재원", 90));
        list.add(new Student("양현철", 45));
        list.add(new Student("유신재", 90));
        list.add(new Student("김재홍", 95));
        list.add(new Student("윤준형", 60));
        for (Student e :list) {
            System.out.println("이름 : " + e.studentName);
            System.out.println("성적 : " + e.score);
        }
    }
}
