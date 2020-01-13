package day_dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CapLetter {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("http:/automationpractice.com"));
        Actions action = new Actions(driver);

        WebElement key = driver.findElement(By.id("search_query_top"));
        Thread.sleep(2000);

        action.moveToElement(key).click().keyDown(Keys.SHIFT).sendKeys("tla").keyUp(Keys.SHIFT).perform();
        action.contextClick().perform();


    }
}
