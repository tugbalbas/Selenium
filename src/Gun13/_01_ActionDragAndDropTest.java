package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar = new Actions(driver); // driver üzerinden aksiyonları çalıştırmak için değişken tanımladım

        WebElement oslo = driver.findElement(By.id("box1")); // osloyu bulduk
        WebElement norway = driver.findElement(By.id("box101")); // norveçi bulduk

        Action aksiyon = aksiyonlar.dragAndDrop(oslo,norway).build();
        Bekle(3);
        aksiyon.perform();

        BekleVeKapat();

    }
}

// aksiyonlar.dragAndDrop(oslo,norway).build().perform(); bu şekilde de çalışır ama tercih etmiyoruz (temiz kod açısından)