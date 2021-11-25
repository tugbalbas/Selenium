package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*

Elemanları statüsü

isSelect();boolean:  checkbox, radiobutton
isEnabled();boolean
isDisplay();boolean

isEnabled()
Monday : true
Sunday : false

isSelect:
Tuesday : true
Friday  : false

isDisplay()
Monday : true
Sunday : true

 */

public class _02_ElemanınStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox"); // siteyi açtım

        WebElement sali = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(sali.isDisplayed());
        System.out.println(sali.isEnabled());
        System.out.println(sali.isSelected()); // burda seçili değil o yüzden
        Bekle(2);
        sali.click(); // burda click ile seçtiriyoruz
        System.out.println(sali.isSelected()); // burda seçili mi diye tekrar kontrol ediyoruz

        BekleVeKapat();

    }
}
/*
true
true
false
true
 */