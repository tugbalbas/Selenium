package Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) throws InterruptedException {
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");

        WebElement eleman = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914894"));
        System.out.println(eleman.getText()); // yazıyıj aldık (consola)

        Thread.sleep(3000); // Bu komutu sadece debug yaparken kullanacağız. İş görüşmelerinde bu komuttan bahsetmiyoruz.
        driver.quit();
    }
}
// element seçiliyken CTRL+ F yapıp aynı isiimde başka eleman var mı diye aratıyoruz!