package Gun05.Proje1.Part2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/"); // linke gitti

        WebElement username=driver.findElement(By.id("username"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("techno123." );

        WebElement sign=driver.findElement(By.id("log-in"));
        sign.click();

        WebElement check=driver.findElement(By.id("time"));
        String text= check.getText();
        Assert.assertEquals("Your nearest branch closes in: 30m 5s",text);

        String url = driver.getCurrentUrl();// şu anda açık olan sayfanın Url sini verir.
        Assert.assertEquals("https://demo.applitools.com/app.html",url);

        Thread.sleep(3000);
        driver.quit();

    }
}
