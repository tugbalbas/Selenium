package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*

     select classı
     görünen text ile seçim için : selectByVisibleText
     valueden seçim için         : selectByValue
     sırasından seçim için       : selectByIndex

 */

public class _02_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com.tr/");
        WebElement dropDownMenu= driver.findElement(By.id("searchDropdownBox")); // select tag olduğu netleştiğinde
        // bu elemanı kullanmak için uygun olan select sınıfı kullanılabilir

        Select menu=new Select(dropDownMenu);
        menu.selectByVisibleText("Kitaplar");

        WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        Bekle(10);
        BekleVeKapat();

    }
}

