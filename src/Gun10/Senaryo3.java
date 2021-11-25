package Gun10;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Senaryo3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://www.saucedemo.com/"); // siteyi açtım
        Login.saucedemoLogin("standard_user"); // login işlemi yapıldı

        WebElement add1=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        add1.click();
        Bekle(1);

        WebElement add2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        add2.click();
        Bekle(1);

        WebElement add3=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        add3.click();
        Bekle(1);

        WebElement add4=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        add4.click();
        Bekle(1);

        WebElement add5=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        add5.click();
        Bekle(1);

        WebElement add6=driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        add6.click();
        Bekle(1);


        WebElement contSepet = driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
        contSepet.click();
        Bekle(1); // sepete tıkla


        WebElement remove1= driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']"));
        remove1.click();
        Bekle(1);
        WebElement remove2= driver.findElement(By.xpath("//*[@id='remove-sauce-labs-bike-light']"));
        remove2.click();
        Bekle(1);
        WebElement remove3= driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));
        remove3.click();
        Bekle(1);
        WebElement remove4= driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']"));
        remove4.click();
        Bekle(1);
        WebElement remove5= driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']"));
        remove5.click();
        Bekle(1);
        WebElement remove6= driver.findElement(By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']"));
        remove6.click();
        Bekle(1); // tüm ürünler sepetten çıkarıldı (REMOVE)

        WebElement bag=driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
        String s=bag.getText();
        if (s==""){
            Assert.assertTrue("urun secilmedi",true);
        }
        Bekle(2);
        BekleVeKapat();
    }
}
