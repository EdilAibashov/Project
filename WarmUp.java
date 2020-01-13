package day_dec21;

import com.google.common.collect.Iterators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class WarmUp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://www.orbitz.com"));
        Map<Object, Object>map = new HashMap<>();
        map.put("apple", "banana");
        map.put(100, 200);
        map.forEach((k,v)-> System.out.println(k+" | "+v));

        List<String>ls = new ArrayList<>();
        ls.add("x");
        ls.add("y");
        ls.add("z");
        System.out.println(ls);

        for(String s : ls){
            System.out.println(s);
        }
        Iterator<String>anyName = ls.iterator();
    }

}
