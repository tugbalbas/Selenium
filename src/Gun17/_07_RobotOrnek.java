package Gun17;

import Utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _07_RobotOrnek extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_S);

        Bekle(3);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_S);

        Bekle(3);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // Aşağıdaki bölüm üzerine kaydetme durumunda
        // tekrar kaydetmesini sağlamak için.
        Bekle(3);
        rbt.keyPress(KeyEvent.VK_LEFT);
        Bekle(3);
        rbt.keyPress(KeyEvent.VK_ENTER);

        rbt.keyRelease(KeyEvent.VK_LEFT);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        Bekle(5);
        BekleVeKapat();




    }
}
