package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
  Senaryo :
  1- https://www.ebay.com/ sitesini açın
  2- Arama seçim menüsünden 2984  değerli elemanı seçtiriniz. selectByValue
  3- Arama işlemini yaptırınız.
 */

public class _03_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com/");
        driver.manage().deleteAllCookies();

        WebElement dropDownMenu= driver.findElement(By.id("gh-cat")); // select tag olduğu netleştiğinde
        // bu elemanı kullnamak için uygun olan select sınıfı kullanılabilir

        Select menu=new Select(dropDownMenu);
        menu.selectByValue("2984");

        WebElement searchButton =driver.findElement(By.id("gh-btn"));
        searchButton.click();

        Bekle(10);
        BekleVeKapat();



    }
}


