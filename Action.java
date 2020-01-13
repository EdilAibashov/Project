package day_dec21;

import dec19.my_libs;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Action {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://demoqa.com"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Tooltip']")).click();
        WebElement click = driver.findElement(By.xpath("//input[@id='age']"));
        WebElement tool = driver.findElement(By.xpath("//p[text()='Hover the field to see the tooltip.']"));
        System.out.println("Pre: "+tool.getText());
        Actions action = new Actions(driver);
        action.moveToElement(click).perform();
        WebElement tool1= driver.findElement(By.xpath("//p[text()='Hover the field to see the tooltip.']"));
        Actions action1 = new Actions(driver);
        action1.moveToElement(tool1).perform();
        System.out.println(tool1.getText());
        System.out.println("After: "+tool.getText());







    }
}
