package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Senaryo4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.cssSelector("input[id$='user-name']"));
        user.sendKeys("standard_user");
        WebElement pass = driver.findElement(By.cssSelector("input[id$='password']"));
        pass.sendKeys("secret_sauce");
        WebElement btn = driver.findElement(By.cssSelector("input[type$='submit']"));
        btn.click(); // login işlemi yapıldı

        // Bütün ürünlerin isimlerini bir yerde tutunuz
        ArrayList<String> liste = new ArrayList<>();

        List<WebElement> listOfItems = driver.findElements(By.className("inventory_item_name"));

        for(int i=0;i<listOfItems.size();i++)
        {
            liste.add(listOfItems.get(i).getText());
        }
        System.out.println(liste);
        List<WebElement> listButton = driver.findElements(By.className("btn_primary"));
        for(WebElement bt:listButton)
        {
            bt.click();
        }

        WebElement basket=driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span"));
        basket.click();

        List<WebElement> listOfItems2 = driver.findElements(By.className("inventory_item_name"));
        if(listOfItems.contains(listOfItems2)) {
            Assert.assertTrue("urunler aynı",true);
            System.out.println();
        }

        Bekle(3);
        BekleVeKapat();
    }
}