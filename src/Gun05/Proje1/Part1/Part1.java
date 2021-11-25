package Gun05.Proje1.Part1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/text-box"); // 1) Bu siteye gidin. ->  http://demoqa.com/text-box

        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.sendKeys("Automation"); // 2) Full Name kısmına "Automation" girin.

        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@example.com"); // 3) Email kısmına "Testing" girin.

        WebElement current = driver.findElement(By.id("currentAddress"));
        current.sendKeys("Testing Current Address"); // 4

        WebElement parment=driver.findElement(By.id("permanentAddress"));
        parment.sendKeys("Testing Permanent Address"); // 5

        WebElement btn = driver.findElement(By.id("submit"));
        btn.click(); // 6

//        WebElement auto=driver.findElement(By.id("userName"));
//        String auto1=fullName.toString(); // fullName in textini aldı
//        Assert.assertEquals("Automation",auto1); // 7

        WebElement email1 = driver.findElement(By.id("userEmail"));
        String emailText1 = email.getText();
        Assert.assertEquals("Testing",emailText1);





        Thread.sleep(5000);
        driver.quit();
    }
}



