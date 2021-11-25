package Gun17;
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascript executer ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    hotels.com, https://p-del.co/
 */


import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _01_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        // JavaScript komutlarını çalıştırmak için önce js değişkeni tanımlandı.
        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,1500)");
        // JavaScript komutu internetten bulunarak, executeScript metodu ile çalıştırıldı
        // window.scrollBy(0,5000) : window u kaydır x ve y miktarında
        // Burada sayfa 3000 pixel kaydırıldı

        Bekle(2);
        js.executeScript("window.scrollBy(0,-500)");
        // Burada sayfa -500 pixel kaydırıldı. - (eksi verildiğinden yukarı doğru kaydırıldı.)

        BekleVeKapat();

    }
}
