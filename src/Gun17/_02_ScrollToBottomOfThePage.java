package Gun17;

// sayfanın sonuna kadar

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js=(JavascriptExecutor) driver;

        // sayfanın en sonuna
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Bekle(2);

        // sayfanın en başına
        js.executeScript("window.scrollTo(0,0)");

        //scrollTo  : Verilen ppixele gider.
        // scrollBy : Verilen kadar daha ileri gider.

        BekleVeKapat();

    }
}
