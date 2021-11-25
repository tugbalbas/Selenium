package Gun17;

import Utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

/*
     İnterview Soruları :
     1- Windows popupları nasıl kontrol edersiniz ? Robot class la
     2- Dosya yükleme işlemini ne ile yaparsınız ? Robot class la
 */
public class _04_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://blog.112dijital.com/web-push-notification-bildirim-kurulumu-detayli-anlatim/");

        Robot rbt=new Robot();

        Bekle(4);
        rbt.keyPress(KeyEvent.VK_TAB); // keyPress TAB tuşuna basıldı
        rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease TAB tuşunu bıraktı

        Bekle(4);
        rbt.keyPress(KeyEvent.VK_TAB); // keyPress TAB tuşuna basıldı
        rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease TAB tuşunu bıraktı

        Bekle(4);
        rbt.keyPress(KeyEvent.VK_TAB); // keyPress TAB tuşuna basıldı
        rbt.keyRelease(KeyEvent.VK_TAB); // keyRelease TAB tuşunu bıraktı

        Bekle(4);
        rbt.keyPress(KeyEvent.VK_ENTER); // keyPress ENTER tuşuna basıldı
        rbt.keyRelease(KeyEvent.VK_ENTER); // keyRelease ENTER tuşunu bıraktı

        Bekle(5);
        BekleVeKapat();


    }
}
