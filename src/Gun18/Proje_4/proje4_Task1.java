package Gun18.Proje_4;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class proje4_Task1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demowebshop.tricentis.com/");

        String anaId=driver.getWindowHandle();

        WebElement logIn= driver.findElement(By.className("ico-login"));
        logIn.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("tech@tech.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("12345asd");

        WebElement loginBtn= driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginBtn.click();

        WebElement facebookBtn= driver.findElement(By.linkText("Facebook"));
        facebookBtn.click();

        Set<String > idLer=driver.getWindowHandles();

        for (String id:driver.getWindowHandles()) {
            if (id.equals(anaId)) continue;
            driver.switchTo().window(id);
        }

        String url2=driver.getCurrentUrl();
        System.out.println(url2);

        Assert.assertTrue(url2.contains("facebook"));

        driver.switchTo().window(anaId);

        WebElement contactUs=driver.findElement(By.linkText("Contact us"));
        contactUs.click();

        WebElement enquiry=driver.findElement(By.id("Enquiry"));
        enquiry.sendKeys("Selenium");

        WebElement submit=driver.findElement(By.name("send-email"));
        submit.click();

        WebElement result=driver.findElement(By.cssSelector("div[class='result']"));
        String expected="Your enquiry has been successfully sent to the store owner.";
        Assert.assertEquals(expected,result.getText());

        for (String id:idLer) {
            driver.switchTo().window(id).close();
        }


    }
}
