package homework.homework3;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class odev_3 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        try {
            driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

            Thread.sleep(2000);
            driver.manage().window().maximize();

            List<WebElement> city = driver.findElements(By.cssSelector("#allItems>li"));
            List<WebElement> country = driver.findElements(By.cssSelector("ul[id*='box']"));

            for (WebElement n : city) {


                for (WebElement m : country) {

                    new Actions(driver).moveToElement(n).clickAndHold().perform();
                    Thread.sleep(200);
                    new Actions(driver).release(m).perform();
                    System.out.println(n.getCssValue("background-color"));

                    if (n.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                        break;
                    }
                }

            }

        }catch(Exception ex) {

        }



    }
}
