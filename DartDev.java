package day_dec21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DartDev {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/edilaibashov/IdeaProjects/Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(("https://orangehrm-demo-6x.orangehrmlive.com/client/#/dashboard"));
        driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
        driver.findElement(By.xpath("//li/a[@data-username='kevin']")).click();
        driver.findElement(By.xpath("//a[@class='collapsible-header waves-effect waves-orange']")).click();
        driver.findElement(By.xpath("(//span[@class='material-icons collapsible-indicator'])[69]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='left-menu-title'])[80]")).click();
        driver.findElement(By.xpath("//a[@id='menu_asset_viewAssets']")).click();
        Thread.sleep(3000);
        driver.switchTo().frame("noncoreIframe");
        System.out.println("================ Categories ================");
        List<WebElement>list = driver.findElements(By.xpath("//tr[@class='dataRaw']/td[3]"));
        int i = 1;
        for (WebElement ls : list){
            System.out.println(ls.getText());
            i++;
        }
        System.out.println("================ Models ==================");
        List<WebElement>list1 =driver.findElements(By.xpath("//tr[@class='dataRaw']/td[5]"));
        int j = 1;
        for(WebElement ls1 : list1){
            System.out.println(ls1.getText());
            j++;
        }

    }
}
