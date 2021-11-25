package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkPartialText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");

        // sadece a taglerinde çalışır
        WebElement element = driver.findElement(By.partialLinkText("Passion")); // Our Passion değil sadece 'Passion' parçası
        System.out.println(element.getAttribute("href")); // linkin yolunu vermiş oldu
        
        Thread.sleep(3000);
        driver.quit();
    }
}
