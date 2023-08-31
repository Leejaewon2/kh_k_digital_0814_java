package 학생성적정렬;
/*
미리 입력 받아 놓고 시작
5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬하고 성적이
같으면 이름순 정렬
 */
public class Student implements Comparable<Student> {
    public String studentName;
    public int score;

    public Student(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    // 반환값이 1이면 정렬해야될 조건
    // 반환값이 -1 정렬 조건이 아님
    // 반환값이 0 정렬 조건은 아니지만 set을 사용하는 경우 중복제거 조건이 됨

    @Override
    public int compareTo(Student o) {
        if (this.score > o.score) return 1; // 연식으로 오름차순 정렬
        else {
            if (this.score == o.score) {
                return this.studentName.compareTo(o.studentName); // 사전 순 정렬
            }
        }
        return -1;
    }
}
