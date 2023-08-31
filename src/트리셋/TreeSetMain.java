package 트리셋;
/*
1. HashSet과 마찬가지로 Set인터페이스를 구현한 클래스로써 객체를 중복해서 저장할 수
   없고 저장 순서가 유지되지 않는다는 Set의 성질을 그대로 가지고 있다
2. 검색 기능을 강화시킨 자료구조이다.
3. 데이터가 저장될 때 이진 검색 트리 형태로 저장되고, 값을 검색을 할때 inOrder(Left-Root-Right) 방식으로 탐색한다.
4. TreeSet은 이진 탐색 트리(BinarySearchTree) 구조로 이루어져 있다.
*/

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for (Integer e : ts) System.out.print(e + " ");

    }
}
