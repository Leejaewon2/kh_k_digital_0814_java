package Arrays클래스;

import java.util.*;

public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
        Arrays.sort(arr); // 오름 차순 정렬
        Arrays.sort(arr, Collections.reverseOrder()); // 내림 차순 정렬
        for (int e : arr) System.out.print(e + " ");
        // 정렬 오버라이딩 : 재정의
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (i1 > i2) return -1; // 오름 차순
                // if(i1 < i2) return 1; // 내림 차순
                return 0;
            }

        });
    }
}
