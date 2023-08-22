package 클래스기본;

import javax.xml.namespace.QName;

public class Student {
    private int ID;      // 학번, 필드라고 부름
    private String name; // 이름
    private int grade;   // 학년
    private String addr; // 주소

    // 메소드
    public  void showInfo() {
        System.out.println(name + ", " + addr);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

