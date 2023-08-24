package 접근제한자;


import 인스턴스필드.Parent;

public class AccessRestrictor {
    public static void main(String[] args) {
        Child child = new Child("엔지니어");
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());

    }
}

class Child extends Parent {
    String jobs;
    public Child(String jobs){
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return  addr;
    }
}




