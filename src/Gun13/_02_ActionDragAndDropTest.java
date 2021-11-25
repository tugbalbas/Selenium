package Gun13;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions aksiyonlar=new Actions(driver); // driver üzerinden aksiyonları çalışştırmak için değişken tanımladım

        WebElement btnBank=driver.findElement(By.id("credit2"));
        WebElement kutuBank=driver.findElement(By.id("bank"));

        Action aksiyon=aksiyonlar.dragAndDrop(btnBank,kutuBank).build(); // burda build ile hazırlıyor
        Bekle(2);
        aksiyon.perform();

        // WebElement kutuIci= driver.findElement(By.cssSelector(" #bank > li "));
        Assert.assertTrue(  kutuBank.getText().equals(btnBank.getText())  );

        BekleVeKapat();

    }
}
