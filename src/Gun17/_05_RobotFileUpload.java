package Gun17;

/*
1- Adım DosyaSeç click
2- dosya yolunu hafızaya atmam lazım-> hafızaya alma komutyla yapacağız.
   hafızadaki dosya yolunu yapıştır-> ctrl+v
3- ENTER
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _05_RobotFileUpload extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

//        WebElement dosyaSec= driver.findElement(By.cssSelector("input[type=file]")); // InvalidArgumentException
//        dosyaSec.click(); // bu elemana yapılamayacak hareketi yapıyorsun

        // işte burada manuel testing çok önemli
        // COZUM --> input yerine div ini aldım

        WebElement dosyaSec= driver.findElement(By.id("file_wraper0"));
        dosyaSec.click();

        // Stringi hafızaya-clipBoarda kopyalama kodu (JAVAnın direkt kodu)
        StringSelection stringSelection = new StringSelection("C:\\Users\\Tuba\\Desktop\\ornek.txt.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
        // Verilen Stringi clipBoarda set ediyor

        // Windows yaptıracağımız için ROBOT (Action değil)
        Robot rbt=new Robot();

        Bekle(4);
        // CTRL+V : hafızadaki bilgiyi yapıştır
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        Bekle(4);

        rbt.keyRelease(KeyEvent.VK_CONTROL); // tuşları serbest bırak
        rbt.keyRelease(KeyEvent.VK_V); // tuşları serbest bırak

        Bekle(4);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Bekle(5);
        WebElement submit = driver.findElement(By.id("submitbutton"));
        submit.click();

        Bekle(5);
        BekleVeKapat();
    }
}

// clipBoard : hafızaya kopyala

// windows a yaptıracağımız işker ROBOT ile
// driverda WebElement e yaptıracağımız işler ACTION ile
