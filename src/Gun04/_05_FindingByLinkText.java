package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");

        // sadece a taglerinde çalışır
        WebElement element = driver.findElement(By.linkText("Check Out"));
        System.out.println(element.getAttribute("data-title")); // özellikleri
        System.out.println(element.getAttribute("data-url"));
        
        Thread.sleep(3000);
        driver.quit();
    }
}
