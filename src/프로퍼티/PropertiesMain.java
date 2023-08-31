package 프로퍼티;

import 커피메뉴만들기.CoffeeMenuList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// Map의 하나의 형태 : 키와 값이 모두 String 타입으로 제한된 형태이다.
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = PropertiesMain.class.getResource("./database.properties").getPath(); // ../database.properties .하나 더 쓰면 패키지에서 -> 클래스로 상위폴더로 옮겨감 그 상태에서 ../커피메뉴만들기/database.properties
        path = URLDecoder.decode(path, "utf-8"); // 한글에 대한 처리를 위해서
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);



    }
}
