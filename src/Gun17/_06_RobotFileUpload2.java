package Gun17;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_RobotFileUpload2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.guru99.com/test/upload/");

        // bu sefer direkt dosya yolunun adresini gönderiyoruz
        WebElement input=driver.findElement(By.id("uploadfile_0"));
        input.sendKeys("C:\\Users\\Tuba\\Desktop\\ornek.txt.txt");

        Bekle(5);
        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

        Bekle(5);
        BekleVeKapat();

    }
}
