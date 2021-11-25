package Gun18.Proje_4;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class proje4_Task2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demowebshop.tricentis.com/");

        WebElement logIn= driver.findElement(By.className("ico-login"));
        logIn.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("tech@tech.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("12345asd");

        WebElement loginBtn=driver.findElement(By.cssSelector("input.button-1.login-button"));
        loginBtn.click();

        Bekle(2);

        WebElement computers=driver.findElement(By.xpath("(//a[@href='/computers'])[3]"));
        computers.click();

        WebElement desktops=driver.findElement(By.xpath("(//a[@href='/desktops'])[3]"));
        desktops.click();

        WebElement buildExp=driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[3]"));
        buildExp.click();

        WebElement fast=driver.findElement(By.cssSelector("input#product_attribute_74_5_26_82"));
        fast.click();

        WebElement ram8GB=driver.findElement(By.cssSelector("input#product_attribute_74_6_27_85"));
        ram8GB.click();

        WebElement hdd=driver.findElement(By.cssSelector("input#product_attribute_74_3_28_87"));
        hdd.click();

        WebElement software= driver.findElement(By.cssSelector("input#product_attribute_74_8_29_90"));
        software.click();


        WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button-74']"));
        addToCart.click();

        WebElement shoppingCart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();

        WebElement agreeCheckBox=driver.findElement(By.id("termsofservice"));
        agreeCheckBox.click();

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        WebElement company=driver.findElement(By.id("BillingNewAddress_Company"));
        company.sendKeys("Techno Study");

        Select country=new Select(driver.findElement(By.cssSelector("select#BillingNewAddress_CountryId")));
        country.selectByVisibleText("Turkey");

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Izmir");

        WebElement address1=driver.findElement(By.id("BillingNewAddress_Address1"));
        address1.sendKeys("Alsancak");

        WebElement address2=driver.findElement(By.id("BillingNewAddress_Address2"));
        address2.sendKeys("Konak");

        WebElement zipCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("3500010");

        WebElement phoneNum=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNum.sendKeys("0155354789560");
        Bekle(1);

        WebElement contun=driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]"));
        contun.click();
        Bekle(1);


        WebElement billingAddress=driver.findElement(By.xpath("(//input[@type='button'])[2]"));
        billingAddress.click();

        WebElement addressCont=driver.findElement(By.xpath("(//input[@title='Continue'])[2]"));
        addressCont.click();
        Bekle(1);

        WebElement shipCont=driver.findElement(By.xpath("(//input[@value='Continue'])[3]"));
        shipCont.click();
        Bekle(1);

        WebElement cash=driver.findElement(By.id("paymentmethod_0"));
        cash.click();

        WebElement payCon=driver.findElement(By.xpath("(//input[@value='Continue'])[4]"));
        payCon.click();

        WebElement payInfoCon=driver.findElement(By.xpath("(//input[@value='Continue'])[5]"));
        payInfoCon.click();

        WebElement confirm=driver.findElement(By.xpath("//input[@value='Confirm']"));
        confirm.click();

        WebElement message=driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        String expected="Your order has been successfully processed!";
        Assert.assertEquals(expected,message.getText());

        BekleVeKapat();

    }
}
