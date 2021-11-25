package Gun14;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_AlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

       WebElement clickMe2= driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
       clickMe2.click();
       Bekle(2);

       driver.switchTo().alert().sendKeys("tugba");
       driver.switchTo().alert().accept();

       WebElement tecxtActual=driver.findElement(By.id("prompt-demo"));
       Assert.assertTrue(tecxtActual.getText().contains("tugba"));

       BekleVeKapat();

    }
}
