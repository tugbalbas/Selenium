package Gun05;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert.*;

public class _01_SendKeysClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/"); // linke gitti

        WebElement link = driver.findElement(By.linkText("Check Out")); // elemanı buldu - 1
        link.click(); // tıkladı - 2

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("info@techno.study"); // herhangi bir şey yazıyoruz - 3

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("tugba"); // text gönderme - 4

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("evet artık biz geldik: yeni testerlar"); // text gönderme - 5

        WebElement btn = driver.findElement(By.className("btn-primary"));
        btn.click(); //Place Order butonuna tıklat - 6

        WebElement menu = driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914882"));
        String menuTxt = menu.getText(); // menu yazısını aldı
        Assert.assertEquals("Menu",menuTxt); // gelen yazının bununla aynı olup olmadığını kontrol ediyor - 7
        // Assert in özelliği hata varsa gösterir yoksa göstermez. hat olmadığı için düzgün çalışıp kapandı
        // hata old zaman program kırıldı kapanmadı ve consolda hatayı gösterdi

        String url = driver.getCurrentUrl();// şu anda açık olan sayfanın Url sini verir. - 8
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?", url);


        Thread.sleep(3000);
        driver.quit();

    }
}
