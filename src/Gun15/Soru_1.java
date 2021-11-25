package Gun15;

/*

1) Bu siteye gidin --> http://zero.webappsecurity.com/login.html
2) Login'e "username" -- Password'a "password" yazın . Sign in button'ına tıklayınız.
3) Transfer founds butonuna tıklayınız.
4) From account kısmından herhangı bir(Random'la tıklatın) değer seçınız.
5) To account kısmından herhangı bir(Random'la tıklatın.) değer seçınız.
6) Her hangi bir amount gırınız.
7) Her hangi bir description giriniz.
8)Continue butonuna tiklayiniz.
9)Submit butonuna tiklayiniz.
10) "You successfully submitted your transaction" Yazısı gözükmesi gerekiyor.

 */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Soru_1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://zero.webappsecurity.com/login.html"); // siteye git

        // Login'e "username" -- Password'a "password" yazın . Sign in button'ına tıklayınız.
        WebElement logIn= driver.findElement(By.cssSelector("input#user_login"));
        logIn.sendKeys("username");
        WebElement passWord= driver.findElement(By.id("user_password"));
        passWord.sendKeys("password");
        WebElement subMit= driver.findElement(By.name("submit"));
        subMit.click();
        WebElement safeBack= driver.findElement(By.id("primary-button"));
        safeBack.click();

        // 3) Transfer founds butonuna tıklayınız.
        WebElement transFound= driver.findElement(By.id("transfer_funds_link"));
        transFound.click();

        //4) From account kısmından herhangı bir(Random'la tıklatın) değer seçınız.
        List<WebElement>options=driver.findElements(By.cssSelector("select#tf_fromAccountId>option"));
        int rand= (int) (Math.random()*(options.size()+1));

        //5) To account kısmından herhangı bir(Random'la tıklatın.) değer seçınız.
        Select fromAccount=new Select(driver.findElement(By.id("tf_fromAccountId")));
        fromAccount.selectByVisibleText(options.get(rand).getText());

        List<WebElement> secenekler=driver.findElements(By.cssSelector("select#tf_toAccountId>option"));
        int random=(int) (Math.random()* (secenekler.size()+1));
        Select toAccount=new Select(driver.findElement(By.id("tf_toAccountId")));
        toAccount.selectByVisibleText(secenekler.get(random).getText());

        //6) Her hangi bir amount gırınız.
        WebElement amount=driver.findElement(By.id("tf_amount"));
        amount.sendKeys("100");

        //7) Her hangi bir description giriniz.
        WebElement description=driver.findElement(By.id("tf_description"));
        description.sendKeys("Kira");

        //8)Continue butonuna tiklayiniz.
        WebElement continuee= driver.findElement(By.id("btn_submit"));
        continuee.click();

        //9)Submit butonuna tiklayiniz.
        WebElement submit= driver.findElement(By.id("btn_submit"));
        submit.click();

        //10) "You successfully submitted your transaction" Yazısı gözükmesi gerekiyor.
        WebElement text=driver.findElement(By.cssSelector("div.alert.alert-success"));
        String excepted="You successfully submitted your transaction";
        Assert.assertEquals(excepted,text.getText());

        BekleVeKapat();













    }
}
