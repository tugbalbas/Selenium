package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.concurrent.TimeUnit;

public class BaseStaticDriver {
    public static WebDriver driver; // burda değişkeni aldık

    static { // methodu çağırmaya gerek kalmasın diye static bloğu yaptık. static dediğimiz an canlı hale geliyor hepsi direkt çalışmış gibi oluyor yani method yapmamıza gerek kalmıyor
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // consoldaki gereksiz bilgileir sessize al
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // bütün webElement için geçerli tüm elemanlar görünene kadar bekleme sağlıyor/*

    }


    public static void BekleVeKapat()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


    public static void Bekle(int saniyeSure)
    {
        try {
            Thread.sleep(saniyeSure*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void Kapat()
    {
        driver.quit();
    }
}

//setPropertyde özelliğin kendisini veriyoruz ve değerini veriyoruz. kullanımı bu şekilde