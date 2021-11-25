package Gun07.cssSelector;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business = driver.findElement(By.cssSelector("input[id$=_4586_0]"));
        business.click();

        Bekle(2);
        WebElement dropDownDiscover= driver.findElement(By.cssSelector("select[id$='4588']"));
        dropDownDiscover.click();

        Bekle(2);
        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("option[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        Bekle(2);
        WebElement buttonEveryDay = driver.findElement(By.cssSelector("input[id$='89585_0']"));
        buttonEveryDay.click();

        Bekle(2);
        WebElement goodRadio = driver.findElement(By.cssSelector("input[id$='4589_0']")); // 5
        goodRadio.click();

        Bekle(2);
        WebElement howLongDropDown = driver.findElement(By.cssSelector("select[id$='4597']"));
        howLongDropDown.click();

        Bekle(2);
        WebElement secenek4 = driver.findElement(By.cssSelector("select[id$='4597'] > :nth-child(4)"));
        secenek4.click();

        goodRadio.click(); // focusun başka yere gitmesini sağladık ki, select kapansın

        Bekle(3);
        BekleVeKapat();

    }
}
