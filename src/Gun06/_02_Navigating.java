package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("http://www.practiceselenium.com/"); // siteyi açıyoruz

        WebElement linkimiz = driver.findElement(By.linkText("Check Out"));
        linkimiz.click(); // tıklama

        Bekle(2); // hızlı gidip geldiği için araya bekle koyuyoruz
        driver.navigate().back(); // back-forward tuşlarını bu şekilde kullanabiliyoruz

        Bekle(2);
        driver.navigate().forward();

        BekleVeKapat();

    }
}

/*
her ikisinde de siteyi açıyoruz

driver.navigate.to --> geçmişi tutabiliyor back ve next yapabiliyoruz
sayfanın tümünün yüklenmesini beklemez
driver.navigate().back();
driver.navigate().forward();

driver.get() --> geçmişi tutmaz sayfanın tümünün yüklenmesini bekler.
 */