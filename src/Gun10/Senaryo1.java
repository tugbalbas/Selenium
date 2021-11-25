package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Senaryo1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/"); // siteyi açtım
        Login.saucedemoLogin("standard_user"); // login işlemi oldu

        // en kolay findElements ile yaparız. çünkü tipleri aynıysa tek tek almamıza gerek yok
        List<WebElement> urunIsimleri=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        for (WebElement e:urunIsimleri) {
            System.out.println(e.getText());
        }
        BekleVeKapat();
    }
}

/*
Sauce Labs Backpack
Sauce Labs Bike Light
Sauce Labs Bolt T-Shirt
Sauce Labs Fleece Jacket
Sauce Labs Onesie
Test.allTheThings() T-Shirt (Red)
 */