package 커피메뉴직렬화;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerialMenuWrite  {
    // 문자열로 만들어진 key와 커피의 여러가지 정보가 포함된 객체를 값으로 사용
    static Map<String, CoffeeMenuinfo> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        makeMenu();
        selectMenu();

    }
    static void makeMenu() {
        map.put("Americano", new CoffeeMenuinfo("Americano", 2500, "Coffee", "기본커피"));
        map.put("Espresso", new CoffeeMenuinfo("Espresso", 3000, "Coffee", "진한커피"));
        map.put("Latte", new CoffeeMenuinfo("Latte", 4000, "Coffee", "우유커피"));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = ""; // 키를 받기 위한 문자열 변수
        while (true) {
            System.out.println("=".repeat(13) + "메뉴 리스트" + "=".repeat(13));
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu) {
                case 1 :
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for (String e : map.keySet()) {
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명 : " + map.get(e).getDescription());
                        System.out.println("-".repeat(28));
                    }
                    break;
                case 2 :
                    System.out.println("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    // 포함 여부를 확인하는 메소드 containsKey(key) : map내에 해당 키가 있는지 확인하여 결과를 반환
                    if (map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCategory());
                        System.out.println("설명 : " + map.get(key).getDescription());
                    } else  System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3 :
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else{
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        map.put(key, new CoffeeMenuinfo(key, price, category, description));
                    }
                    break;
                case 4 :
                    System.out.println("삭제할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제 하였습니다. ");
                    } else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }
                    break;
                case 5 :
                    System.out.println("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        // 키값은 동일하고 값이 변경되는 경우에 replace()사용
                        map.replace(key, new CoffeeMenuinfo(key, price, category, description));
                    }else {
                        System.out.println("수정 할 메뉴가 없습니다.");
                    }
                    break;

                case 6 :
                    System.out.println("=".repeat(10) + "메뉴를 종료 합니다." + "=".repeat(10));
                    FileOutputStream fos = new FileOutputStream("src/커피메뉴직렬화/coffee.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);
                    oos.flush();
                    oos.close();
                    fos.close();
                    return;

                default: System.out.println("선택하신 메뉴가 없습니다.");
            }
        }
    }
}

