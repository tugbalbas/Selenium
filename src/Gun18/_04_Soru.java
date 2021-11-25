package Gun18;

/*
    Senaryo
    1- https://www.yogaalliance.org/ sitesine gidiniz.
    2- Become a Member menüsünden  Teachers  a tıklatınız.
    3- Çıkan sayfanın title ının "Teachers | Yoga Alliance"  olup olmadığını assert ile kontrol ediniz.
 */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_Soru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.yogaalliance.org/"); // siteye git
        Actions actions=new Actions(driver);

        WebElement becomeMember= driver.findElement(By.linkText("Become a Member"));
        WebElement tecHers= driver.findElement(By.cssSelector("li.root.haschild.child-2>ul>li+li+li>a"));
        Action action=actions.moveToElement(becomeMember).moveToElement(tecHers).build();
        action.perform();
        Action action1=actions.moveToElement(tecHers).click().build();
        action1.perform();
        Bekle(1);
        System.out.println(driver.getTitle());

        String expected="Teachers | Yoga Alliance";
        Assert.assertEquals(expected,driver.getTitle());

        BekleVeKapat();
    }
}
