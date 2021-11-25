package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        Bekle(2);
        // id sürekli değiştiği için 1- id ve 2- css kullanamıyoruz o yüzden XPath ile bulmak zorundayız
        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar = new Actions(driver); // driver üzerinden aksiyonları çalıştırmak için değişken tanımladım
        System.out.println("Aksiyon öncesi");

        Action aksiyon = aksiyonlar.moveToElement(clickButton).click().build(); // Aksiyon hazırlandı, henüz hareket yok
        System.out.println("Aksiyon tanımlandı");
        Bekle(3);
        System.out.println("Aksiyon gerçekleşti");
        aksiyon.perform(); // aksiyonu gerçekleştir

        Bekle(2);
        BekleVeKapat();

    }
}
// build() her zaman olacak!
// moveToElementde mouse gitmiş gibi oluyor gerçekten gitmiyor


