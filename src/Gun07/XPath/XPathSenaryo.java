package Gun07.XPath;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathSenaryo extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        // Login işlemi
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Bekle(1);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        Bekle(1);

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        Bekle(1);

        // ilk ürüne tıklandı ve eklendi
        WebElement backPackElement = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack'] "));
        backPackElement.click();
        Bekle(1);
        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();
        Bekle(1);

        // Geri dön
        WebElement buttonBack = driver.findElement(By.xpath("//button[text()='Back to products']"));
        buttonBack.click();
        Bekle(1);

        // 2. ürürne tıklandı ve eklendi
        WebElement boltTshirtTextElement = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirtTextElement.click();
        Bekle(1);
        WebElement addToCart2 = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCart2.click();

        // sepete tıkla
        Bekle(1);
        WebElement contSepet = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        contSepet.click();

        // 7- CheckOut tıkla
        Bekle(1);
        WebElement buttonCheckOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        buttonCheckOut.click();

        //isim girişi
        Bekle(1);
        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id='first-name']"));
        firstNameInput.sendKeys("Tugba");

        // soyisim girişi
        Bekle(1);
        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id='last-name']"));
        lastNameInput.sendKeys("albas");

        // postal-code girişi
        Bekle(1);
        WebElement postalCode = driver.findElement(By.xpath("//*[@id='postal-code']"));
        postalCode.sendKeys("12345");

        Bekle(1);
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();

        //ürün fiyatlarını kontrol ediliyor
        WebElement urun1Fiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        String txtFiyat1 = urun1Fiyat.getText();
        System.out.println("txtFiyat1 = " + txtFiyat1);

        WebElement urun2Fiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        String txtFiyat2 = urun2Fiyat.getText();
        System.out.println("txtFiyat2 = " + txtFiyat2);

        WebElement toplamFiyat = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String txtToplam = toplamFiyat.getText();
        System.out.println("txtToplam = " + txtToplam);

        double fiyat1 = stringToDouble(txtFiyat1);
        double fiyat2 = stringToDouble(txtFiyat2);
        double toplam = stringToDouble(txtToplam);

        //Assert.assertEquals(toplam, (fiyat1+fiyat2)); kullanımdan kaldırılmış, kullanmıyoruz double equal

        Assert.assertTrue(toplam == (fiyat1 + fiyat2));

        BekleVeKapat();

    }
    public static double stringToDouble(String strTutar){
        String sadeceRakamHali = strTutar.replaceAll("[^\\d.]","");

        return Double.parseDouble(sadeceRakamHali);

    }

}

// http://gizemgulec.com/2020/05/css-selector-ve-xpath-kullanimlari/

/*
INTERVIEW sorusu:

Genel Locator stratejisi
1- Önce id
2- yoksa CSS Selector for everything else
3- hiçbiri yoksa XPath

 */

/*

2 tane XPath var:
Absolute:
Relative:

 */