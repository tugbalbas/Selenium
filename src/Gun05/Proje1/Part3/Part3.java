package Gun05.Proje1.Part3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com"); // 1

        WebElement teddy= driver.findElement(By.id("inputValEnter"));
        teddy.sendKeys("teddy bear");
        WebElement btn=driver.findElement(By.className("searchformButton"));
        btn.click(); // 2

        WebElement element= driver.findElement(By.className("nnn"));
        String text=element.getText();
        Assert.assertEquals("We've got 346 results for 'teddy bear'",text);

        WebElement btn2=driver.findElement(By.className("notIeLogoHeader"));
        btn2.click();

        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/",url);


        Thread.sleep(3000);
        driver.quit();
    }
}
