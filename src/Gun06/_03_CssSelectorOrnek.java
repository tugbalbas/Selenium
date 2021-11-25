package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("");

        WebElement element=driver.findElement(By.cssSelector("[class='form-actions'][style='text-align: right']")); // idsi yok.

        BekleVeKapat();
    }
}

// Diiğerlerinin yetmediği durumlarda CSS Selector kullanıyoruz

// id, name yok ise çok seçenekli özellikleri yanyana getirip

// CSSde [id=email] ile #email aynı şey demek
// CSSde [class=editor_colllections] ile .editor_collections aynı şey demek

// child -> içindeki eleman
// sibling -> aynı hizadaki eleman