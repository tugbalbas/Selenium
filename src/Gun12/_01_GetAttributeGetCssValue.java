package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetAttributeGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));

        // tagin içindeki keylerin değerlerini almamızı sağlar
        System.out.println(inputValEnter.getAttribute("name"));
        System.out.println(inputValEnter.getAttribute("type"));
        System.out.println(inputValEnter.getAttribute("class"));

        // Elemanın CSS yani ekranda görünen tüm özelliklerini; font, renk vs ulaşmamızı sağlar
        System.out.println(inputValEnter.getCssValue("color"));
        System.out.println(inputValEnter.getCssValue("font-size"));
        System.out.println(inputValEnter.getCssValue("background"));
        // ülke-başkent eşleştirmesinde kullanıcaz yeşil mi?

        BekleVeKapat();



    }
}
// tagin başladığı ve bittiği yerdeki eşittirle başlayan her şey attribute

/*

keyword
text
col-xs-20 searchformInput keyword
rgba(51, 51, 51, 1)
14px
rgba(244, 244, 244, 0.6) none repeat scroll 0% 0% / auto padding-box border-box

 */