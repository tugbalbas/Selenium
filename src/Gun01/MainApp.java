package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
    public static void main(String[] args) {

        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım: driver
        WebDriver driver = new ChromeDriver();

        //siteyi açtım
        driver.get("https://www.google.com/");



    }
}
